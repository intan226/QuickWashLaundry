package com.example.quickwashlaundry;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class CustomerGallery extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_customer_gallery);
        viewPager = findViewById(R.id.viewPager2);
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(R.drawable.cust1);
        arrayList.add(R.drawable.cust2);
        arrayList.add(R.drawable.cust3);
        arrayList.add(R.drawable.cust4);

        SliderAdapter sliderAdapter = new SliderAdapter(this,arrayList);
        viewPager.setAdapter(sliderAdapter);


    }
}