package com.fdlsolution.playstore;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.annotation.ColorRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numoftab = 0;
    PagerAdapter adapter;
    ApplicationFragment fragment,fragment1,fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //onSearchRequested();
      //  ViewPager pager = findViewById(R.id.pager);

        final TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("JUEGOS"));
        tabs.addTab(tabs.newTab().setText("PELICULAS"));
        tabs.addTab(tabs.newTab().setText("LIBROS"));
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);


      //  tabs.setupWithViewPager(pager);


        numoftab = tabs.getTabCount();

      //  adapter = new PagerAdapter(getSupportFragmentManager(),numoftab);
      //  pager.setAdapter(adapter);
       //pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition())
                {
                    case 0:
                        tabs.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        break;
                    case 1:
                        onSearchRequested();
                        tabs.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        FragmentManager manager = getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        fragment = new ApplicationFragment();
                        fragment1 = new ApplicationFragment();
                        fragment2 = new ApplicationFragment();
                        transaction.add(R.id.frame1, fragment);
                        transaction.add(R.id.frame2, fragment1);
                        transaction.add(R.id.frame3, fragment2);
                        transaction.commit();


                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        /*

        TextView textTittle = findViewById(R.id.textTittle);
        textTittle.setText("Favorites Aps");

        TextView textSubTittle = findViewById(R.id.textSubtittle);
        textSubTittle.setText("Y mucho mas");


        ImageView img1 = findViewById(R.id.image1);
        img1.setImageResource(R.drawable.facebook);
        TextView textimg1 = findViewById(R.id.textImg1);
        textimg1.setText("FACEBOOK");
        TextView version1 = findViewById(R.id.textMBimg1);
        version1.setText("40 MB");





        ImageView img2 = findViewById(R.id.image2);
        img2.setImageResource(R.drawable.instagram);
        TextView textimg2 = findViewById(R.id.textImg2);
        textimg2.setText("INSTAGRAM");
        TextView version2 = findViewById(R.id.textMBimg2);
        version2.setText("25 MB");


        ImageView img3 = findViewById(R.id.image3);
        img3.setImageResource(R.drawable.whatsapp);
        TextView textimg3 = findViewById(R.id.textImg3);
        textimg3.setText("WHATSAPP");
        TextView version3 = findViewById(R.id.textMBimg3);
        version3.setText("42 MB");

        ImageView img4 = findViewById(R.id.imageView);
        img4.setImageResource(R.drawable.assasin);
        TextView textimg4 = findViewById(R.id.textImg4);
        textimg4.setText("ASSASIN");
        TextView version4 = findViewById(R.id.textMBimg4);
        version4.setText("42 MB");
*/
    }

    @Override
    protected void onResume() {
        super.onResume();
        onSearchRequested();

    }
}