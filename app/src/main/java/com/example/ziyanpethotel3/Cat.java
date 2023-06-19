package com.example.ziyanpethotel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
    }

    public void Book (View view) {
        Intent intent = new Intent(Cat.this, Booking.class);
        startActivity(intent);
    }
}