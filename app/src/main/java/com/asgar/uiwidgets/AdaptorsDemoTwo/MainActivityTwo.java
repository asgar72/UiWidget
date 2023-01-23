package com.asgar.uiwidgets.AdaptorsDemoTwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.asgar.uiwidgets.R;
                        //BaseAdopter use
public class MainActivityTwo extends AppCompatActivity {

    ListView listView_two;

    int[] animal_imgs = {R.drawable.lion, R.drawable.dog, R.drawable.dear, R.drawable.picock, R.drawable.parrot,R.drawable.lion, R.drawable.dog, R.drawable.dear, R.drawable.picock, R.drawable.parrot};
    String[] animal_names={"Lion","Dog","Dear","pickok","Parrot","Lion","Dog","Dear","pickok","Parrot"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        listView_two = findViewById(R.id.listView_two);

        MyAdaptorsTwo adaptorsTwo = new MyAdaptorsTwo(getApplicationContext(),animal_imgs,animal_names);
        listView_two.setAdapter(adaptorsTwo);

    }
}