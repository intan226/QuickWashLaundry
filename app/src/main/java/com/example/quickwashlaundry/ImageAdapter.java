package com.example.quickwashlaundry;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public Integer[] thumbImages = {
            R.drawable.washing, R.drawable.drying, R.drawable.ironing,
            R.drawable.folding, R.drawable.specialty, R.drawable.selfservice,

    };

    public ImageAdapter (Context c) {
        mContext = c;
    }
    @Override
    public int getCount(){
        return thumbImages.length;
    }
    @Override
    public Object getItem(int position){
        return thumbImages[position];
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
