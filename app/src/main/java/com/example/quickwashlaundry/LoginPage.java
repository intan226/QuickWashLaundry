package com.example.quickwashlaundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class LoginPage extends AppCompatActivity {

    private Button loginButton;
    private TextInputEditText emailInput, passwordInput;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page); // Set the layout

        // Find UI elements
        loginButton = findViewById(R.id.button4);
        emailInput = findViewById(R.id.inputEmail);
        passwordInput = findViewById(R.id.inputPassword);
        mAuth = FirebaseAuth.getInstance();

        // Handle login button click
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                Intent homepageIntent = new Intent(LoginPage.this, Homepage.class);
                startActivity(homepageIntent);

            }
        });

        TextView create_new_account = findViewById(R.id.textView6);
        create_new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(LoginPage.this, SignUp.class);
                startActivity(signupIntent);
            }
        });
    }
}