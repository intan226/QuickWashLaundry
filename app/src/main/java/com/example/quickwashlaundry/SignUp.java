package com.example.quickwashlaundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    private Button signupButton;
    private TextInputEditText emailInput, usernameInput, passwordInput;

    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); // Set the layout

        // Find UI elements
        signupButton = findViewById(R.id.button4);
        emailInput = findViewById(R.id.inputEmail);
        passwordInput = findViewById(R.id.inputPassword);
        mAuth = FirebaseAuth.getInstance();

        // Handle signup button click
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString().trim();

                String password = passwordInput.getText().toString().trim();
                mAuth.createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(),"User created successfully",Toast.LENGTH_SHORT).show();
                                    finish();
                                    Intent i = new Intent(getApplicationContext(),LoginPage.class);
                                    startActivity(i);

                                } else {
                                    Toast.makeText(getApplicationContext(),"User could not be found",Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });
    }
}