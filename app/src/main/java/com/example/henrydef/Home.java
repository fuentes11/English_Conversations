package com.example.henrydef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.henrydef.U2.U2C1;

public class Home extends AppCompatActivity {
    TextView next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        next = (TextView) findViewById(R.id.nextconver1);

        next.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }
}