package com.example.quickwashlaundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Initialize buttons
        Button buttonServices = findViewById(R.id.buttonServices);
        Button buttonAboutUs = findViewById(R.id.buttonAbout);
        Button buttonDevelopers = findViewById(R.id.buttonDevelopers);
        Button buttonCustomer = findViewById(R.id.buttonCustomer);
        Button buttonLogout = findViewById(R.id.buttonLogout);

        // Set onClick listeners
        buttonServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Services page
                Intent intent = new Intent(Homepage.this, Services.class);
                startActivity(intent);
            }
        });

        buttonAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to About Us page
                Intent intent = new Intent(Homepage.this, AboutUs.class);
                startActivity(intent);
            }
        });

        buttonDevelopers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Developers page
                Intent intent = new Intent(Homepage.this, Developers.class);
                startActivity(intent);
            }
        });

        buttonCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Customer page
                Intent intent = new Intent(Homepage.this, CustomerGallery.class);
                startActivity(intent);
            }
        });

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Logout
                // Add your logout logic here (e.g., clearing user session)
                finish(); // Close the app or return to login screen
            }
        });
    }
}