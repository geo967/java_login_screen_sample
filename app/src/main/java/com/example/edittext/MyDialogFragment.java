package com.example.edittext;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());

        builder.setTitle("Invalid Credentials");
        builder.setMessage("Are u Sure u want to try again?");
        builder.setCancelable(false);

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Try again",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Toast.makeText(getActivity(),"You Cancelled",Toast.LENGTH_SHORT).show();
                System.exit(0);
            }
        });
        return builder.create();

    }
}
