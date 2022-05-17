package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login=findViewById(R.id.login);
        EditText edittext1=findViewById(R.id.edittext1);
        EditText edittext2=findViewById(R.id.edittext2);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredName=edittext1.getText().toString().trim();
                String enteredRoll=edittext2.getText().toString().trim();
                if(enteredName.equals("geo")&&enteredRoll.equals("1")){
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("Name",enteredName);
                i.putExtra("roll",enteredRoll);
                startActivity(i);}
                else{
                        new MyDialogFragment().show(getSupportFragmentManager(),"Invalid");
                }
            }
        });
    }
}