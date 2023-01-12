package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarDemo extends AppCompatActivity {
    ProgressBar My_Progress;
    int progress_value = 0;
    Button btn_pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_demo);

        My_Progress = findViewById(R.id.My_Progress);
        btn_pro = findViewById(R.id.btn_pro);
    }

    public void startProgressBar(View view) {
        btn_pro.setVisibility(View.GONE);// this is for hiding the button
        setProgressbarValue(progress_value);
    }

    //this is thread for starting the progress bar..
    void setProgressbarValue(int i) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                My_Progress.setProgress(i);
                setProgressbarValue(i + 1);

            }
        });
        thread.start();
    }
}