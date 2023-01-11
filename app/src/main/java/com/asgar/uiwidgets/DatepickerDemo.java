package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class DatepickerDemo extends AppCompatActivity {
    DatePicker datepicker1;
    TextView tv_dates;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker_demo);

        datepicker1 = findViewById(R.id.datepicker1);

        tv_dates =findViewById(R.id.tv_dates);

        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);

        tv_dates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog =new DatePickerDialog(DatepickerDemo.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tv_dates.setText(dayOfMonth+"/"+month+1+"/"+year);

                    }
                }, year,month,day);
                datePickerDialog.show();
            }
        });
    }

    //int month =datepicker1.getMonth()+1; // +1 isly kyu ke isme month zero se count hota hai ..
    public void getDate(View view) {
        int month = datepicker1.getMonth() + 1;
        int year = datepicker1.getYear();
        int day = datepicker1.getDayOfMonth();

          Toast.makeText(this, "Month " + (month + 1) + " - " + day + " - " + year, Toast.LENGTH_SHORT).show();


        //============== get current date and time =============//
//        Calendar c = Calendar.getInstance();
//        int day = c.get(Calendar.DAY_OF_MONTH);
//        int month = c.get(Calendar.MONTH);
//        int year = c.get(Calendar.YEAR);

//        Toast.makeText(this, "Month " + (month + 1) + " - " + day + " - " + year, Toast.LENGTH_SHORT).show();
    }
}