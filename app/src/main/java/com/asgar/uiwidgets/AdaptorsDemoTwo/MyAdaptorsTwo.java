package com.asgar.uiwidgets.AdaptorsDemoTwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.asgar.uiwidgets.R;

import org.w3c.dom.Text;

public class MyAdaptorsTwo extends BaseAdapter
{

    // this is instance variable..
    Context context;
    int[] animal_img;
    String[] animal_names;

    LayoutInflater inflater;

    MyAdaptorsTwo(Context context, int[] animal_img, String[] animal_name)
    {
        this.context=context;
        this.animal_img=animal_img;
        this.animal_names=animal_name;

        inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return animal_img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       convertView = inflater.inflate(R.layout.ui_view_two,null);

        ImageView imageView = convertView.findViewById(R.id.imgview_two);
        TextView textView = convertView.findViewById(R.id.textView_two);

        imageView.setImageResource(animal_img[position]);
        textView.setText(animal_names[position]);

        return convertView;
    }
}
