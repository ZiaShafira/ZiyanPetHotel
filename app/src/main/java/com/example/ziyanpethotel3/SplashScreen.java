package com.example.ziyanpethotel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private int load=3000;

    //3000=3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent Login = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(Login);
                finish();

            }
        },load);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
