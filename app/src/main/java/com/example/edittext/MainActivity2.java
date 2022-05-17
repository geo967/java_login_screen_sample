package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text1=findViewById(R.id.text1display);
        TextView text2=findViewById(R.id.text2display);
        Button nextPage=findViewById(R.id.next_page);

        Bundle bundle=getIntent().getExtras();

        String name=bundle.getString("Name");
        String roll=bundle.getString("roll");

        text1.setText("Good morning : "+name);
        text2.setText("your number is :"+roll);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);

            }
        });
    }
}