package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.asgar.uiwidgets.Form.MyForm;
import com.asgar.uiwidgets.Form.SpinnerDemo;

public class ButtonClickEvent extends AppCompatActivity {

    EditText my_et_name;
    Button my_btn_one, btn_toast1, btn_toast2,btn_main3,btn_Form,btn_spinner;
    TextView my_tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event);

        my_et_name = findViewById(R.id.et_name);
        my_btn_one = findViewById(R.id.btn_one);
        my_tv_name = findViewById(R.id.tv_name);

        btn_toast1 = findViewById(R.id.btn_toast1);
        btn_toast2 = findViewById(R.id.btn_toast2);
        btn_main3 = findViewById(R.id.btn_Main3);
        btn_Form = findViewById(R.id.btn_Form);
        btn_spinner = findViewById(R.id.btn_spinner);

        my_btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = my_et_name.getText().toString();
                my_tv_name.setText("Name : " + name);
            }
        });

        btn_toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ButtonClickEventTwo.class);
                startActivity(intent);
            }
        });

        btn_toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CustomToast.class));
            }
        });

        btn_main3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        btn_Form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MyForm.class));
            }
        });

        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SpinnerDemo.class));
            }
        });

    }
}