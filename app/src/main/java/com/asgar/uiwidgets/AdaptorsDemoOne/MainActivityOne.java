package com.asgar.uiwidgets.AdaptorsDemoOne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.asgar.uiwidgets.R;

                            //BaseAdapter Use
//In this activity which Adapter use  BaseAdapter use...
//First create a activity and create a array in activity insert the data source ..
//then complete xml file and then create a UI layout for showing data source which  form ..
public class MainActivityOne extends AppCompatActivity {
    GridView gridview_one;

    //this is dara source....
    int[] animal_arr = {R.drawable.lion, R.drawable.parrot, R.drawable.picock, R.drawable.dear, R.drawable.dog, R.drawable.lion, R.drawable.parrot, R.drawable.picock, R.drawable.dear, R.drawable.dog, R.drawable.lion, R.drawable.parrot, R.drawable.picock, R.drawable.dear, R.drawable.dog,R.drawable.lion, R.drawable.parrot, R.drawable.picock, R.drawable.dear, R.drawable.dog, R.drawable.lion, R.drawable.parrot, R.drawable.picock, R.drawable.dear, R.drawable.dog, R.drawable.lion, R.drawable.parrot, R.drawable.picock, R.drawable.dear, R.drawable.dog};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        gridview_one = findViewById(R.id.gridview_one);

        //yaha se data soucre leke adapter mai chale gy ..aur phir adapter ko gridView mai set kra diya.
        MyAdaptorsOne adaptorsOne = new MyAdaptorsOne(getApplicationContext(), animal_arr);
        gridview_one.setAdapter(adaptorsOne);

    }
}