package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ImageSwitcherDemo extends AppCompatActivity {
    ImageSwitcher img_switcher;
    int[] image_arr = {R.drawable.m1, R.drawable.two, R.drawable.three, R.drawable.ui};
    int img_index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher_demo);

        img_switcher = findViewById(R.id.img_switcher);

        //ViewSwitcher is Pre Defined class
        //ViewFactory is interface
        img_switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                return imageView;
            }
        });
        img_switcher.setImageResource(image_arr[0]);
    }

    public void nextBtn(View view) {
        img_index = img_index + 1;
        if(img_index==image_arr.length)
        {
            img_index=0;
        }
        img_switcher.setImageResource(image_arr[img_index]);
    }

    public void PreviousBtn(View view) {
        img_index = img_index - 1;
        if(img_index<0)
        {
            img_index=image_arr.length-1;
        }
        img_switcher.setImageResource(image_arr[img_index]);
    }
}