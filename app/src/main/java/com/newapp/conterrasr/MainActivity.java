package com.newapp.conterrasr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStarOne = findViewById(R.id.buttonStarRealmsOne);
        Button buttonStarTwo = findViewById(R.id.buttonStarRealmsTwo);
        Button buttonThreeCounters = findViewById(R.id.buttonResArcana);

        buttonStarOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Switch to OneCounterActivity
                Intent intent = new Intent(MainActivity.this, Star_realms_one_playerActivity.class);
                startActivity(intent);
            }
        });

       buttonStarTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Switch to TwoCountersActivity
                Intent intent = new Intent(MainActivity.this, Star_realms_two_playerActivity.class);
                startActivity(intent);
            }
        });

        buttonThreeCounters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Switch to ThreeCountersActivity
                Intent intent = new Intent(MainActivity.this, ResArcanaActivity.class);
                startActivity(intent);
            }
        });
    }
}