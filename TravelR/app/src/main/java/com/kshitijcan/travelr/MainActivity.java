
package com.kshitijcan.travelr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent in=new Intent(MainActivity.this, HomeScreen.class);
                startActivity(in);
                finish();
            }
        },4000);
    }
}