package com.example.ziyanpethotel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class Details extends AppCompatActivity {
    String[] items = {"BCA", "Mandiri", "Dana", "ShopeePay"};

    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        final Button Details =  findViewById(R.id.btnPay);
        autoCompleteTxt = findViewById(R.id.auto1);
        adapterItems = new ArrayAdapter<>(this, R.layout.list_item,items);
        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String item = parent.getItemAtPosition(position).toString();
            }
        });

        Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Details.this, Success.class));
                Toast.makeText(Details.this, "Payment Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}