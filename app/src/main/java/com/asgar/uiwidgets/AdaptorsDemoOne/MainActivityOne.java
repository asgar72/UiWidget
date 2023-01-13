package com.asgar.uiwidgets.AdaptorsDemoOne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.asgar.uiwidgets.R;

public class MainActivityOne extends AppCompatActivity {
    GridView gridview_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        gridview_one = findViewById(R.id.gridview_one);

    }
}