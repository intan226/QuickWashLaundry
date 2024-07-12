package com.example.quickwashlaundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button buttonStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStarted = findViewById(R.id.buttonStarted);

        buttonStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                navigateToLoginPage();
            }
        });
    }

    private void navigateToLoginPage() {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}