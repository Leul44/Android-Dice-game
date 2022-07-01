package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class Activity3 extends AppCompatActivity {
    ImageView toss1;
    ImageView toss2;
    ImageView toss3;
    TextView player1_toss;
    TextView player2_toss;
    TextView bet1;
    TextView bet2;
    Button player1btn;
    Button player2btn;
    TextView playername1_disp;
    TextView playername2_disp;
    TextView winnerV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        toss1 = findViewById(R.id.toss1);
        toss2 = findViewById(R.id.toss2);
        toss3 = findViewById(R.id.toss3);
        player1_toss = findViewById(R.id.player1_toss);
        player2_toss = findViewById(R.id.player2_toss);
        bet1 = (TextView) findViewById(R.id.bet1);
        bet2 = findViewById(R.id.bet2);
        player1btn = findViewById(R.id.player1btn);
        player2btn = findViewById(R.id.player2btn);
        playername1_disp = findViewById(R.id.player1namedisp);
        playername2_disp = findViewById(R.id.player2namedisp);
        winnerV = findViewById(R.id.winner);


        String[] bet_player1 = getIntent().getStringArrayExtra("Player_bet2");
        String[] bet_player2 = getIntent().getStringArrayExtra("Player_bet1");
        String[] player1id = getIntent().getStringArrayExtra("Player_Name");
        String[] player2id = getIntent().getStringArrayExtra("Player_Name2");
        for (String X : bet_player1) {
            bet2.setText("Bet Amount$" + " " + X);

        }
        for (String X : bet_player2) {
            bet1.setText("Bet Amount$" + " " + X);
        }
        for (String X : player1id) {
            playername1_disp.setText(X);
        }
        for (String X : player2id) {
            playername2_disp.setText(X);
        }



       /*if(Arrays.equals(total,total2)){
            winnerV.setText("No Winners");
        }if (total.length>total2.length) {
            winnerV.setText("Player1 wins");
        }else if(total.length<total2.length){
            winnerV.setText("Player1 wins");
        }*/

        int count;
        player1btn.setOnClickListener(new View.OnClickListener() {


            public int sum = 0;


            @Override
            public void onClick(View v) {


                int score = new Random().nextInt(6) + 1;
                int score2 = new Random().nextInt(6) + 1;
                int score3 = new Random().nextInt(6) + 1;
                sum = sum + score + score2 + score3;
                player1_toss.setText(String.valueOf(sum));


                switch (score2) {
                    case 1:
                        toss1.setImageResource(R.drawable.dice1);

                        break;
                    case 2:
                        toss1.setImageResource(R.drawable.dice2);

                        break;
                    case 3:
                        toss1.setImageResource(R.drawable.dice3);

                        break;
                    case 4:
                        toss1.setImageResource(R.drawable.dice4);

                        break;
                    case 5:
                        toss1.setImageResource(R.drawable.dice5);

                        break;
                    case 6:
                        toss1.setImageResource(R.drawable.dice6);
                        break;
                }
                //--------------------------//
                switch (score) {
                    case 1:
                        toss2.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        toss2.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        toss2.setImageResource(R.drawable.dice3);

                        break;
                    case 4:
                        toss2.setImageResource(R.drawable.dice4);

                        break;
                    case 5:
                        toss2.setImageResource(R.drawable.dice5);

                        break;
                    case 6:
                        toss2.setImageResource(R.drawable.dice6);
                        break;

                }
                switch (score3) {
                    case 1:
                        toss3.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        toss3.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        toss3.setImageResource(R.drawable.dice3);

                        break;
                    case 4:
                        toss3.setImageResource(R.drawable.dice4);

                        break;
                    case 5:
                        toss3.setImageResource(R.drawable.dice5);

                        break;
                    case 6:
                        toss3.setImageResource(R.drawable.dice6);
                        break;

                }
                if (sum >= 100) {
                    winnerV.setText("Player1 wins");
                    player1btn.setEnabled(false);
                    player2btn.setEnabled(false);
                    return;
                }
                player1btn.setEnabled(false);
                player2btn.setEnabled(true);

            }
        });
        ///////////////// Player 2////////////////////////////
        player2btn.setOnClickListener(new View.OnClickListener() {
            int sum2 = 0;

            @Override
            public void onClick(View v) {


                int score = new Random().nextInt(6) + 1;
                int score2 = new Random().nextInt(6) + 1;
                int score3 = new Random().nextInt(6) + 1;
                sum2 = sum2 + score + score2 + score3;

                player2_toss.setText(String.valueOf(sum2));


                switch (score2) {
                    case 1:
                        toss1.setImageResource(R.drawable.dice1);

                        break;
                    case 2:
                        toss1.setImageResource(R.drawable.dice2);

                        break;
                    case 3:
                        toss1.setImageResource(R.drawable.dice3);

                        break;
                    case 4:
                        toss1.setImageResource(R.drawable.dice4);

                        break;
                    case 5:
                        toss1.setImageResource(R.drawable.dice5);

                        break;
                    case 6:
                        toss1.setImageResource(R.drawable.dice6);
                        break;
                }
                //--------------------------//
                switch (score) {
                    case 1:
                        toss2.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        toss2.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        toss2.setImageResource(R.drawable.dice3);

                        break;
                    case 4:
                        toss2.setImageResource(R.drawable.dice4);

                        break;
                    case 5:
                        toss2.setImageResource(R.drawable.dice5);

                        break;
                    case 6:
                        toss2.setImageResource(R.drawable.dice6);
                        break;

                }
                switch (score3) {
                    case 1:
                        toss3.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        toss3.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        toss3.setImageResource(R.drawable.dice3);

                        break;
                    case 4:
                        toss3.setImageResource(R.drawable.dice4);

                        break;
                    case 5:
                        toss3.setImageResource(R.drawable.dice5);

                        break;
                    case 6:
                        toss3.setImageResource(R.drawable.dice6);
                        break;

                }
                player1btn.setEnabled(true);
                player2btn.setEnabled(false);
                if (sum2 >= 100) {
                    winnerV.setText("Player2 wins");
                    player1btn.setEnabled(false);
                    player2btn.setEnabled(false);
                    return;
                }

            }
        });
    }
}

