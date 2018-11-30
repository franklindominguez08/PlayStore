package com.fdlsolution.playstore;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ApplicationFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View myview = inflater.inflate(R.layout.fragment_application, container, false);


        TextView textTittle = myview.findViewById(R.id.textTittle);
        textTittle.setText("Favorites Aps");

        TextView textSubTittle = myview.findViewById(R.id.textSubtittle);
        textSubTittle.setText("Y mucho mas");


        ImageView img1 = myview.findViewById(R.id.image1);
        img1.setImageResource(R.drawable.facebook);
        TextView textimg1 = myview.findViewById(R.id.textImg1);
        textimg1.setText("FACEBOOK");
        TextView version1 = myview.findViewById(R.id.textMBimg1);
        version1.setText("40 MB");





        ImageView img2 = myview.findViewById(R.id.image2);
        img2.setImageResource(R.drawable.instagram);
        TextView textimg2 = myview.findViewById(R.id.textImg2);
        textimg2.setText("INSTAGRAM");
        TextView version2 = myview.findViewById(R.id.textMBimg2);
        version2.setText("25 MB");


        ImageView img3 = myview.findViewById(R.id.image3);
        img3.setImageResource(R.drawable.whatsapp);
        TextView textimg3 = myview.findViewById(R.id.textImg3);
        textimg3.setText("WHATSAPP");
        TextView version3 = myview.findViewById(R.id.textMBimg3);
        version3.setText("42 MB");

        ImageView img4 = myview.findViewById(R.id.imageView);
        img4.setImageResource(R.drawable.assasin);
        TextView textimg4 = myview.findViewById(R.id.textImg4);
        textimg4.setText("ASSASIN");
        TextView version4 = myview.findViewById(R.id.textMBimg4);
        version4.setText("42 MB");
        //container.addView(myview);
        return myview;

    }


}
