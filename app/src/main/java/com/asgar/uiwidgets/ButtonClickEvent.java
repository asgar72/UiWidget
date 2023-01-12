package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonClickEvent extends AppCompatActivity {

    EditText my_et_name;
    Button my_btn_one;
    TextView my_tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event);

        my_et_name = findViewById(R.id.et_name);
        my_btn_one = findViewById(R.id.btn_one);
        my_tv_name = findViewById(R.id.tv_name);



        my_btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = my_et_name.getText().toString();
                my_tv_name.setText("Name : " + name);
            }
        });

    }
}