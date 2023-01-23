package com.asgar.uiwidgets.AdaptorsDemoThree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.asgar.uiwidgets.R;

    //In this activity use the ArrayAdapter only

//In this activity which Adapter use  ArrayAdapter use...
//First create a activity and create a array in activity insert the data source ..
//then complete xml file and then create a UI layout for showing data source which  form ..

public class MainActivityThree extends AppCompatActivity {

    String[] name_arr= {"Asgar","Ali","Sahil","Amar","Shajar","Dilshad","Hasan","Asgar","Ali","Sahil","Amar","Shajar","Dilshad","Hasan","Asgar","Ali","Sahil","Amar","Shajar","Dilshad","Hasan","Asgar","Ali","Sahil","Amar","Shajar","Dilshad","Hasan"};
    ListView listview_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);
        listview_three =findViewById(R.id.listview_three);

        //agar aik single list hai toh ham log adapter ko yahi par create kr skte hai aur directly display krwa sakte hai

        ArrayAdapter<String> arrayAdapter  = new ArrayAdapter<String>(this,R.layout.ui_view_three,R.id.text_view1,name_arr);
        listview_three.setAdapter(arrayAdapter);

    }
}