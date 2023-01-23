package com.asgar.uiwidgets.AdaptorsDemoThree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.asgar.uiwidgets.R;

public class MainActivityThree extends AppCompatActivity {

    String[] name_arr= {"Asgar","Ali","Sahil","Amar","Shajar","Dilshad","Hasan"};
    ListView listview_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);
        listview_three =findViewById(R.id.listview_three);

        ArrayAdapter<String> arrayAdapter  = new ArrayAdapter<String>(this,R.layout.ui_view_three,R.id.text_view1,name_arr);
        listview_three.setAdapter(arrayAdapter);

    }
}