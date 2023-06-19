package com.example.ziyanpethotel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView Register =  findViewById(R.id.btnRegister);
        final Button Google =  findViewById(R.id.google);

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, Home.class));
                Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, Register.class));
            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void home (View view) {
        username = findViewById(R.id.username);
        pass = findViewById(R.id.pass);

        String usernametxt, passtxt;

        usernametxt = username.getText().toString().trim();
        passtxt = pass.getText().toString().trim();

        if (usernametxt.isEmpty() || passtxt.isEmpty()) {
            Toast.makeText(this, "Fill the Login Form!", Toast.LENGTH_SHORT).show();
        } else {
            if (usernametxt.equals("ziyan") && passtxt.equals("456")) {
                Intent intent = new Intent(LoginActivity.this, Home.class);
                startActivity(intent);
                Toast.makeText(LoginActivity.this, "Welcome Ziyan", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "wrong username or password", Toast.LENGTH_SHORT).show();
            }
        }
    }
}