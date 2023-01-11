package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class TimepickerDemo extends AppCompatActivity {
    TimePicker timepicker;
    TextView tv_time;
    TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker_demo);

        timepicker = findViewById(R.id.timepicker);
        timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {

                Toast.makeText(TimepickerDemo.this, "" + hourOfDay + " : " + minute, Toast.LENGTH_SHORT).show();
            }
        });

        tv_time = findViewById(R.id.tv_time);

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR);
        int min = c.get(Calendar.MINUTE);

        tv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePickerDialog = new TimePickerDialog(TimepickerDemo.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        tv_time.setText(hourOfDay + " : " + minute);
                    }
                }, hour, min, false);
                timePickerDialog.show();
            }
        });
    }
}