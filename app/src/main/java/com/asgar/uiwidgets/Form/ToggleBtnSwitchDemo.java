package com.asgar.uiwidgets.Form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.asgar.uiwidgets.R;

public class ToggleBtnSwitchDemo extends AppCompatActivity {
ToggleButton wifi_togglebtn;
Switch wifi_switch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_btn_switch_demo);
     wifi_togglebtn = findViewById(R.id.wifi_toggle);
     wifi_switch = findViewById(R.id.wifi_switch);
    }

    public  void getValuesFromToggle(View view)
    {
        if(wifi_togglebtn.isChecked())
        {
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Wifi On", Toast.LENGTH_SHORT).show();
        }
    }
    public  void getValuesFromSwitch(View view)
    {
        if (wifi_switch.isChecked())
        {
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Wifi On", Toast.LENGTH_SHORT).show();
        }
    }
}