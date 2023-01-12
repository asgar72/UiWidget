package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarDemo extends AppCompatActivity {
SeekBar my_seekBar;
TextView sb_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_demo);

        my_seekBar = findViewById(R.id.my_seekBar);
        sb_value = findViewById(R.id.sb_value);


        my_seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progress_value=0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // yaha par progress mai value aa rhe the isly value ko yaha se get krne prgress_value mai bhyj diya.
                progress_value=progress;
                sb_value.setText(progress_value+"");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
               // sb_value.setText(progress_value+"");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //  sb_value.setText(progress_value+"");
            }
        });

    }
}