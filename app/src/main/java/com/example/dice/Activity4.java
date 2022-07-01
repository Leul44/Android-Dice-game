package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Account account= (Account) getIntent().getSerializableExtra("MYACCOUNT") ;

        TextView textView= (TextView) findViewById(R.id.accountid);
        textView.setText(account.getBankName()+"     "+account.getAccountNumber()+"     "+account.getBalance());

        //Toast.makeText(this, getIntent().getSerializableExtra("MYACCOUNT").toString(), Toast.LENGTH_LONG).show();
    }

}