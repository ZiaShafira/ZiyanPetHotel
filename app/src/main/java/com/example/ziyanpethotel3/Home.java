package com.example.ziyanpethotel3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView  = findViewById(R.id.navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.content2,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.content2,homeFragment).commit();
                        return true;
                    case R.id.nav_profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.content2,profileFragment).commit();
                        return true;
                }

                return false;
            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}