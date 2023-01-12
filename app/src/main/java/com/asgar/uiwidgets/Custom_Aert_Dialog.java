package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Custom_Aert_Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_aert_dialog);
    }
    public void openCustomDialog(View view)
    {
        //Dialog aik class hoti hai uska object create kiya or current class ko call kr diya
        Dialog dialog = new Dialog(Custom_Aert_Dialog.this);
        dialog.setContentView(R.layout.layout_custom_alert_dialog);
        dialog.setCancelable(false);

        //custom layout ke button ke id ko Dialog ke object ke throw get krna ...
        //dialog.findViewById(R.id.cus_dialog_btn);
        Button cus_dialog_btn = dialog.findViewById(R.id.cus_dialog_btn);
        cus_dialog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Custom_Aert_Dialog.this, "You Click on Button", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();

    }
}