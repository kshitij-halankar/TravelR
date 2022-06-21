package com.kshitijcan.travelr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

public class HomeScreen extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private ImageButton menu, worldMap, worldClock, travelTips, travelJournal, currencyConvertor, weightConvertor, distanceConvertor, volumeConvertor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        tabLayout=findViewById(R.id.hometabs);
        viewPager=findViewById(R.id.homeviewpager);

        tabLayout.setupWithViewPager(viewPager);

        HomeViewPageAdapter homeViewPageAdapter=new HomeViewPageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        homeViewPageAdapter.addFragment(new PlannerFragment(),"Planner");
        homeViewPageAdapter.addFragment(new MyTripsFragment(),"My Trips");
        homeViewPageAdapter.addFragment(new UtiltiesFragment(),"Utilities");
        viewPager.setAdapter(homeViewPageAdapter);

        menu=findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent in=new Intent(HomeScreen.this,);
            }
        });


    }
}