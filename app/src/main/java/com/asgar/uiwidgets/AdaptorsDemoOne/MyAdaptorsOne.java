package com.asgar.uiwidgets.AdaptorsDemoOne;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.asgar.uiwidgets.R;


//BaseAdapter is a class .
//Implement the all methods ,
public class MyAdaptorsOne extends BaseAdapter {

    //create a constructor

    Context context;
    int[] data;
    LayoutInflater inflater;

    MyAdaptorsOne(Context context, int[] data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater.from(context));
    }


    //getCount methods count krega ke hamre data source ke andar kitne items hai.
    @Override
    public int getCount() {
        return data.length;
    }

    //koun sa item select ho raha hai uske position
    @Override
    public Object getItem(int position) {
        return null;
    }

    //items id ko ye get krega.
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // jo bhe data hai usko view ko upar set krega aur return krega.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.ui_view_one, null);
        ImageView imageView_one = convertView.findViewById(R.id.imageView_one);
        imageView_one.setImageResource(data[position]);
        return convertView;
    }
}
