package com.example.ziyanpethotel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText username, email, address, phonenumber, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final Button Login =  findViewById(R.id.google);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this, Home.class));
                Toast.makeText(Register.this, "Welcome", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void home (View view) {
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);
        phonenumber = findViewById(R.id.phone);
        password = findViewById(R.id.pass);


        String usernametxt,emailtxt,addresstxt,phonetxt,passtxt;

        usernametxt = username.getText().toString().trim();
        passtxt = password.getText().toString().trim();
        emailtxt = email.getText().toString().trim();
        addresstxt = address.getText().toString().trim();
        phonetxt = phonenumber.getText().toString().trim();

        if (usernametxt.isEmpty() || passtxt.isEmpty() || emailtxt.isEmpty() || addresstxt.isEmpty() || phonetxt.isEmpty()) {
            Toast.makeText(this, "Fill the Registration Form!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(Register.this, Home.class);
            startActivity(intent);
            Toast.makeText(Register.this, "Welcome", Toast.LENGTH_SHORT).show();
            }
        }
}