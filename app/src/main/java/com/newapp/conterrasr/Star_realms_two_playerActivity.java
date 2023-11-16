package com.newapp.conterrasr;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Star_realms_two_playerActivity extends AppCompatActivity {

    private Button buttonP1Add1;
    private Button buttonP1Sub1;
    private Button buttonP1Add5;
    private Button buttonP1Add10;
    private Button buttonP1Sub5;
    private Button buttonP1Sub10;
    private Button buttonP1Reset;
    private TextView textCounterP1SR1;
    private int counterP1 = 50;

    private Button buttonP2Add1;
    private Button buttonP2Sub1;
    private Button buttonP2Add5;
    private Button buttonP2Add10;
    private Button buttonP2Sub5;
    private Button buttonP2Sub10;
    private Button buttonP2Reset;
    private TextView textCounterP2SR1;
    private int counterP2 = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.star_realms_two_player);

        buttonP1Add1 = findViewById(R.id.buttonP1Add1);
        buttonP1Add5 = findViewById(R.id.buttonP1Add5);
        buttonP1Add10 = findViewById(R.id.buttonP1Add10);

        buttonP1Sub1 = findViewById(R.id.buttonP1Sub1);
        buttonP1Sub5 = findViewById(R.id.buttonP1Sub5);
        buttonP1Sub10 = findViewById(R.id.buttonP1Sub10);

        buttonP1Reset = findViewById(R.id.buttonP1Reset);

        textCounterP1SR1 = findViewById(R.id.textCounterP1SR1);

        buttonP2Add1 = findViewById(R.id.buttonP2Add1);
        buttonP2Add5 = findViewById(R.id.buttonP2Add5);
        buttonP2Add10 = findViewById(R.id.buttonP2Add10);

        buttonP2Sub1 = findViewById(R.id.buttonP2Sub1);
        buttonP2Sub5 = findViewById(R.id.buttonP2Sub5);
        buttonP2Sub10 = findViewById(R.id.buttonP2Sub10);

        buttonP2Reset = findViewById(R.id.buttonP2Reset);

        textCounterP2SR1 = findViewById(R.id.textCounterP2SR1);

        buttonP1Add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterP1++;
                textCounterP1SR1.setText(String.valueOf(counterP1));
            }
        });

        buttonP1Add5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterP1 += 5;
                textCounterP1SR1.setText(String.valueOf(counterP1));
            }
        });

        buttonP1Add10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterP1 += 10;
                textCounterP1SR1.setText(String.valueOf(counterP1));
            }
        });

        buttonP1Sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterP1 > 0) {
                    counterP1--;
                    textCounterP1SR1.setText(String.valueOf(counterP1));
                }
            }
        });

        buttonP1Sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterP1 >= 5) {
                    counterP1 -= 5;
                    textCounterP1SR1.setText(String.valueOf(counterP1));
                } else if (counterP1 < 5 && counterP1 > 0) {
                    counterP1 = 0;
                    textCounterP1SR1.setText(String.valueOf(counterP1));
                }
            }
        });

        buttonP1Sub10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterP1 >= 10) {
                    counterP1 -= 10;
                    textCounterP1SR1.setText(String.valueOf(counterP1));
                } else if (counterP1 < 10 && counterP1 > 0) {
                    counterP1 = 0;
                    textCounterP1SR1.setText(String.valueOf(counterP1));
                }
            }
        });

        buttonP1Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterP1 = 50;
                textCounterP1SR1.setText(String.valueOf(counterP1));
            }
        });


        buttonP2Add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterP2++;
                textCounterP2SR1.setText(String.valueOf(counterP2));
            }
        });

        buttonP2Add5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterP2 += 5;
                textCounterP2SR1.setText(String.valueOf(counterP2));
            }
        });

        buttonP2Add10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterP2 += 10;
                textCounterP2SR1.setText(String.valueOf(counterP2));
            }
        });

        buttonP2Sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterP2 > 0) {
                    counterP2--;
                    textCounterP2SR1.setText(String.valueOf(counterP2));
                }
            }
        });

        buttonP2Sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterP2 >= 5) {
                    counterP2 -= 5;
                    textCounterP2SR1.setText(String.valueOf(counterP2));
                } else if (counterP2 < 5 && counterP2 > 0) {
                    counterP2 = 0;
                    textCounterP2SR1.setText(String.valueOf(counterP2));
                }
            }
        });

        buttonP2Sub10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterP2 >= 10) {
                    counterP2 -= 10;
                    textCounterP2SR1.setText(String.valueOf(counterP2));
                } else if (counterP2 < 10 && counterP2 > 0) {
                    counterP2 = 0;
                    textCounterP2SR1.setText(String.valueOf(counterP2));
                }
            }
        });

        buttonP2Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterP2 = 50;
                textCounterP2SR1.setText(String.valueOf(counterP2));
            }
        });
    }
}
