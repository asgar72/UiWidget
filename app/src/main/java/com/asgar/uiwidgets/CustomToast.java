package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast extends AppCompatActivity {
    EditText et_my_phone;
    TextView tv_my_phon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);

       et_my_phone = findViewById(R.id.et_phone);


    }

    public void OpenCustomToast(View view)
    {
        LayoutInflater lf= getLayoutInflater();
        View layout = lf.inflate(R.layout.layout_custom_toast_design,(ViewGroup) findViewById(R.id.ct_toast));

        tv_my_phon = layout.findViewById(R.id.tv_phone);

        String phone = et_my_phone.getText().toString();
        tv_my_phon.setText(phone);

        Toast t = new Toast(getApplicationContext());
        t.setGravity(Gravity.CENTER,0,0);
        t.setDuration(Toast.LENGTH_SHORT);
        t.setView(layout);
        t.show();

    }
}