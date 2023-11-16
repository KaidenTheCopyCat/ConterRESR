package com.newapp.conterrasr;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResArcanaActivity extends AppCompatActivity {


    private Button buttonElanAdd;
    private Button buttonCalmAdd;
    private Button buttonDeathAdd;
    private Button buttonLifeAdd;
    private Button buttonGoldAdd;
    private Button buttonElanSub;
    private Button buttonCalmSub;
    private Button buttonDeathSub;
    private Button buttonLifeSub;
    private Button buttonGoldSub;
    private Button buttonReset;
    private TextView textCounterElan;
    private TextView textCounterCalm;
    private TextView textCounterDeath;
    private TextView textCounterLife;
    private TextView textCounterGold;
    private int counterElan = 1;
    private int counterCalm = 1;
    private int counterDeath = 1;
    private int counterLife = 1;
    private int counterGold = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resarcana);

        buttonElanAdd=findViewById(R.id.elanAdd);
        buttonElanSub=findViewById(R.id.elanSub);
        textCounterElan=findViewById(R.id.counterElan);

        buttonCalmAdd=findViewById(R.id.calmAdd);
        buttonCalmSub=findViewById(R.id.calmSub);
        textCounterCalm=findViewById(R.id.counterCalm);

        buttonDeathAdd=findViewById(R.id.deathAdd);
        buttonDeathSub=findViewById(R.id.deathSub);
        textCounterDeath=findViewById(R.id.counterDeath);

        buttonLifeAdd=findViewById(R.id.lifeAdd);
        buttonLifeSub=findViewById(R.id.lifeSub);
        textCounterLife=findViewById(R.id.counterLife);

        buttonGoldAdd=findViewById(R.id.goldAdd);
        buttonGoldSub=findViewById(R.id.goldSub);
        textCounterGold=findViewById(R.id.counterGold);

        buttonReset=findViewById(R.id.resReset);

        buttonElanAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterElan++;
                textCounterElan.setText(String.valueOf(counterElan));
            }
        });

        buttonElanSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(counterElan > 0){
                   counterElan--;
                   textCounterElan.setText(String.valueOf(counterElan));
               }
            }
        });

        buttonCalmAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterCalm++;
                textCounterCalm.setText(String.valueOf(counterCalm));
            }
        });

        buttonCalmSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterCalm > 0){
                    counterCalm--;
                    textCounterCalm.setText(String.valueOf(counterCalm));
                }
            }
        });

        buttonDeathAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterDeath++;
                textCounterDeath.setText(String.valueOf(counterDeath));
            }
        });

        buttonDeathSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterDeath > 0){
                    counterDeath--;
                    textCounterDeath.setText(String.valueOf(counterDeath));
                }
            }
        });

        buttonLifeAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterLife++;
                textCounterLife.setText(String.valueOf(counterLife));
            }
        });

        buttonLifeSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterLife > 0){
                    counterLife--;
                    textCounterLife.setText(String.valueOf(counterLife));
                }
            }
        });

        buttonGoldAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterGold++;
                textCounterGold.setText(String.valueOf(counterGold));
            }
        });

        buttonGoldSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterGold > 0){
                    counterGold--;
                    textCounterGold.setText(String.valueOf(counterGold));
                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterElan = 1;
                counterCalm = 1;
                counterDeath = 1;
                counterLife = 1;
                counterGold = 1;
                textCounterElan.setText(String.valueOf(counterElan));
                textCounterCalm.setText(String.valueOf(counterCalm));
                textCounterDeath.setText(String.valueOf(counterDeath));
                textCounterLife.setText(String.valueOf(counterLife));
                textCounterGold.setText(String.valueOf(counterGold));
            }
        });

    }
}
