package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.asgar.uiwidgets.R;

public class MyForm extends AppCompatActivity {
    EditText etf_name, etf_password, etf_phone;
    RadioButton rd_male, rd_female;
    CheckBox ch_android, ch_flutter, ch_IOS;
    Spinner sp_cities;

    //custom toast
    TextView tv_name, tv_phone, tv_pass, rd_choose, cb_1, selecter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);

        etf_name = findViewById(R.id.etf_name);
        etf_password = findViewById(R.id.etf_password);
        etf_phone = findViewById(R.id.etf_phone);
        rd_male = findViewById(R.id.rd_male);
        rd_female = findViewById(R.id.rd_female);
        ch_android = findViewById(R.id.ch_android);
        ch_flutter = findViewById(R.id.ch_Flutter);
        ch_IOS = findViewById(R.id.ch_IOS);
        sp_cities = findViewById(R.id.sp_cities);
    }

   /*
        //This is print normal toast /...........///.........//////.././.
        public void getAllValues(View view) {
        //============get values from edittext==================
        String name = etf_name.getText().toString();
        String password = etf_password.getText().toString();
        String phone = etf_phone.getText().toString();

        //============get values from radio button===============
        String gender="";
        if (rd_male.isChecked())
        {
            //gender="M";
            gender = rd_male.getText().toString();
        }
        if(rd_female.isChecked())
        {
            //gender="F";
            gender = rd_female.getText().toString();
        }
        //=============get values from checkbox================

        String interest="";
        if(ch_android.isChecked())
        {
            interest +=ch_android.getText().toString()+"\n";
        }
        if(ch_flutter.isChecked())
        {
            interest +=ch_flutter.getText().toString()+"\n";
        }
        if(ch_IOS.isChecked())
        {
            interest +=ch_IOS.getText().toString()+"\n";
        }
        //=============get values from spinner=====================
        String city = sp_cities.getSelectedItem().toString();
        //===============Print all values in toast=====================
        String res = name+"\n"+phone+"\n"+password+"\n"+gender+"\n"+interest+"\n"+city;
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();}*/

    public void getAllValues(View view) {
        LayoutInflater lf = getLayoutInflater();
        View layout = lf.inflate(R.layout.custom_form_toast, (ViewGroup) findViewById(R.id.form_toast));

        tv_name = findViewById(R.id.tv_name);
        tv_phone = findViewById(R.id.tv_phone);
        tv_pass = findViewById(R.id.tv_pass);
        rd_choose = findViewById(R.id.rd_choose);
        cb_1 = findViewById(R.id.cb_1);
        selecter = findViewById(R.id.selecter);


        String name = etf_name.getText().toString();
        tv_name.setText(name);
        String password = etf_password.getText().toString();
        tv_pass.setText(password);
        String phone = etf_phone.getText().toString();
        tv_phone.setText(phone);

        //============get values from radio button===============
        String gender = "";
        if (rd_male.isChecked()) {
            //gender="M";
            gender = rd_male.getText().toString();
            rd_choose.setText(gender);
        }
        if (rd_female.isChecked()) {
            //gender="F";
            gender = rd_female.getText().toString();
            rd_choose.setText(gender);
        }
        //=============get values from checkbox================

        String interest = "";
        if (ch_android.isChecked()) {
            interest += ch_android.getText().toString() + "\n";
            cb_1.setText(interest);
        }
        if (ch_flutter.isChecked()) {
            interest += ch_flutter.getText().toString() + "\n";
            cb_1.setText(interest);
        }
        if (ch_IOS.isChecked()) {
            interest += ch_IOS.getText().toString() + "\n";
            cb_1.setText(interest);
        }
        String city = sp_cities.getSelectedItem().toString();
        selecter.setText(city);

        Toast t = new Toast(getApplicationContext());
        t.setGravity(Gravity.CENTER, 0, 0);
        t.setDuration(Toast.LENGTH_SHORT);
        t.setView(layout);
        t.show();
    }
}