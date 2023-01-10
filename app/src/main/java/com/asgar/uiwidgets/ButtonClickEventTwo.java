package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonClickEventTwo extends AppCompatActivity {

    EditText et_my_email;
    Button btn_my_two;
    TextView tv_my_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event_two);

        et_my_email = findViewById(R.id.et_email);
        btn_my_two = findViewById(R.id.btn_two);
        tv_my_email = findViewById(R.id.tv_email);
    }


    public void getUserEmail(View view) {
        String email = et_my_email.getText().toString();
        //tv_my_email.setText("Email : "+email);
        tv_my_email.setText("Email : " + email);
        Toast.makeText(this, "Email :" + email, Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(), "Email :"+email, Toast.LENGTH_SHORT).show();
    }

}