package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarDemo extends AppCompatActivity {
RatingBar my_ratings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_demo);

        my_ratings = findViewById(R.id.my_ratings);
    }

    public  void getRatings(View view)
    {
       float f =  my_ratings.getRating();
        Toast.makeText(this, "Rating is "+f, Toast.LENGTH_SHORT).show();

    }
}