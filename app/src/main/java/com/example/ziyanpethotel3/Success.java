package com.example.ziyanpethotel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        final Button Home =  findViewById(R.id.btnHome);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Success.this, Home.class));
            }
        });
    }
}