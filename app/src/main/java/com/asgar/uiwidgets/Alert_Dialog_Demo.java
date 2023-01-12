package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Alert_Dialog_Demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_demo);
    }

    public  void openAlertDialog(View view)
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setIcon(R.drawable.ui);
        alertDialogBuilder.setTitle("AlertDialogExample");
        alertDialogBuilder.setMessage("Do you want to close this application ?");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Alert_Dialog_Demo.this, "You Clicked NO .....!", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Alert_Dialog_Demo.this, "You Clicked Yes .....!", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Alert_Dialog_Demo.this, "You Clicked Cancel", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.show();
    }
}