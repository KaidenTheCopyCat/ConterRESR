package com.newapp.conterrasr;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Star_realms_one_playerActivity extends AppCompatActivity {
    private Button buttonAdd1;
    private Button buttonSub1;
    private Button buttonAdd5;
    private Button buttonAdd10;
    private Button buttonSub5;
    private Button buttonSub10;
    private Button buttonReset;
    private TextView textCounterSR1;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.star_realms_one_player);

        buttonAdd1 = findViewById(R.id.buttonAdd1);
        buttonAdd5= findViewById(R.id.buttonAdd5);
        buttonAdd10 = findViewById(R.id.buttonAdd10);

        buttonSub1 = findViewById(R.id.buttonSub1);
        buttonSub5 = findViewById(R.id.buttonSub5);
        buttonSub10 = findViewById(R.id.buttonSub10);

        buttonReset = findViewById(R.id.buttonReset);

        textCounterSR1 = findViewById(R.id.textCounterSR1);

        buttonAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                textCounterSR1.setText(String.valueOf(counter));
            }
        });

        buttonAdd5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                counter+=5;
                textCounterSR1.setText(String.valueOf(counter));
            }
        });

        buttonAdd10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                counter+=5;
                textCounterSR1.setText(String.valueOf(counter));
            }
        });

        buttonSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter > 0) {
                    counter--;
                    textCounterSR1.setText(String.valueOf(counter));
                }
            }
        });

        buttonSub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter >= 5) {
                    counter-=5;
                    textCounterSR1.setText(String.valueOf(counter));
                }
                else if (counter <5  && counter >0){
                    counter =0;
                    textCounterSR1.setText(String.valueOf(counter));
                }
            }
        });

        buttonSub10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter >= 10) {
                    counter-=10;
                    textCounterSR1.setText(String.valueOf(counter));
                }
                else if (counter <5  && counter >0){
                    counter =10;
                    textCounterSR1.setText(String.valueOf(counter));
                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter=50;
                textCounterSR1.setText(String.valueOf(counter));
            }
        });



    }

}
