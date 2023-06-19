package com.example.ziyanpethotel3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Calendar;

public class Booking extends AppCompatActivity {
    String[] items = {"Cat", "Dog"};
    String[] items2 = {"Cat VIP Room 1", "Dog VIP Room 1", "Cat VIP Room 2", "Dog VIP Room 2", "Cat Standard Room 1", "Dog Standard Room 1", "Cat Standard Room 2", "Dog Standard Room 2"};

    EditText dateTXT;
    EditText dateTXT2;
    ImageView cal;
    ImageView cal2;
    private int mDate, mMonth, mYear;

    AlertDialog.Builder builder;

    AutoCompleteTextView autoCompleteTxt;
    AutoCompleteTextView autoCompleteTxt2;
    ArrayAdapter<String> adapterItems;
    ArrayAdapter<String> adapterItems2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        final Button Booking =  findViewById(R.id.btnBooking);
        builder = new AlertDialog.Builder(this);
        autoCompleteTxt = findViewById(R.id.auto1);
        autoCompleteTxt2 = findViewById(R.id.auto2);
        adapterItems = new ArrayAdapter<>(this, R.layout.list_item,items);
        adapterItems2 = new ArrayAdapter<>(this, R.layout.list_item,items2);
        autoCompleteTxt.setAdapter(adapterItems);
        autoCompleteTxt2.setAdapter(adapterItems2);
        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String item = parent.getItemAtPosition(position).toString();
            }
        });
        autoCompleteTxt2.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String item2 = parent.getItemAtPosition(position).toString();
            }
        });

        Booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Setting message manually and performing action on button click
                builder.setMessage("Are you sure the data is correct?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(Booking.this, Details.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        dateTXT = findViewById(R.id.date);
        dateTXT2 = findViewById(R.id.date2);
        cal = findViewById(R.id.datepicker);
        cal2 = findViewById(R.id.datepicker2);


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar Cal = Calendar.getInstance();
                mDate = Cal.get(Calendar.DATE);
                mMonth = Cal.get(Calendar.MONTH);
                mYear = Cal.get(Calendar.YEAR);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Booking.this, android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int date) {
                        dateTXT.setText(date+"-"+month+"-"+year);
                    }
                }, mYear,mMonth,mDate);
                datePickerDialog.show();
            }
        });

        cal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar Cal2 = Calendar.getInstance();
                mDate = Cal2.get(Calendar.DATE);
                mMonth = Cal2.get(Calendar.MONTH);
                mYear = Cal2.get(Calendar.YEAR);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Booking.this, android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int date) {
                        dateTXT2.setText(date+"-"+month+"-"+year);
                    }
                }, mYear,mMonth,mDate);
                datePickerDialog.show();
            }
        });
    }


}