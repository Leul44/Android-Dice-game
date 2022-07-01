package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Activity2 extends AppCompatActivity {
    ImageView imageview;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        imageview = findViewById(R.id.imgdice);
        button = findViewById(R.id.solotossbtn);
        textView = findViewById(R.id.solotext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int score = random.nextInt(6) + 1;
                textView.setText(String.valueOf(score));

                switch (score) {
                    case 1:
                        imageview.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageview.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageview.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageview.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageview.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageview.setImageResource(R.drawable.dice6);
                        break;
                }
                }

        });
    }}