package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =  findViewById(R.id.soloplay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                OpenActivity2();
            }
        });
    }
    public void OpenActivity2 () {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    public void OpenActivity5(View view){
        Intent intent = new Intent(this,Activity5.class);
        startActivity(intent);
    }
    public void openActivity4(View view){
      /*  Intent intent= new Intent(this,Activity4.class);
        startActivity(intent);*/
    }
    public void highscores(View view){



        Intent intent= new Intent(getApplicationContext(),Activity4.class);

        Account account= new Account(1234567,145.98,"myBank");
        intent.putExtra("MYACCOUNT", account);
        startActivity(intent);
    }



}