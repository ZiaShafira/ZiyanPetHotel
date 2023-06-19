package com.example.ziyanpethotel3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ImageSlider imageSlider;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        Button b = (Button) rootView.findViewById(R.id.btnBooking);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Booking.class);
                startActivity(intent);

            }

        });
        ImageView Cat = (ImageView) rootView.findViewById(R.id.imageCatOne);
        Cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cat.class);
                startActivity(intent);

            }

        });
        ImageView Dog = (ImageView) rootView.findViewById(R.id.imageDog);
        Dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Dog.class);
                startActivity(intent);

            }

        });
        imageSlider = rootView.findViewById(R.id.imageslider);

        ArrayList<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.kandang1,null));
        imageList.add(new SlideModel(R.drawable.kandang2,null));
        imageList.add(new SlideModel(R.drawable.kandang3,null));
        imageList.add(new SlideModel(R.drawable.kandang4,null));

        imageSlider.setImageList(imageList);
        return rootView;

    }


    }