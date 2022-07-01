package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {
    public EditText betplayer1;
    private EditText betplayer2;
    private EditText player1_entername;
    private EditText player2_entername;
        private Button playAll;
        private TextView bet_1;
    private TextView bet_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        player1_entername= findViewById(R.id.player_1enter_name);
        player2_entername= findViewById(R.id.player_2enter_name);
        betplayer1=findViewById(R.id.betplayer1);
        betplayer2=findViewById(R.id.betplayer2);
        playAll=findViewById(R.id.play);
        bet_1=findViewById(R.id.bet1);
        bet_2=findViewById(R.id.bet2);




    }


        public void SummitButtonforplayers(View view){
        String player1id= player1_entername.getText().toString();
        String player2id= player2_entername.getText().toString();
        String bet_player1=betplayer1.getText().toString();
            String bet_player2=betplayer2.getText().toString();


            Intent intent= new Intent(getApplicationContext(),Activity3.class);

            intent.putExtra("Player_Name",new String[]{player1id});
            intent.putExtra("Player_Name2",new String[]{player2id});
            intent.putExtra("Player_bet1",new String[]{bet_player1});
            intent.putExtra("Player_bet2",new String[]{bet_player2});

            startActivity(intent);
        }




}