package com.example.a777;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class screen3 extends AppCompatActivity {
    public void Next1(View v) {
        Intent intent = new Intent(screen3.this, screen4.class);
        startActivity(intent);
    }
    public void Skip2(View v) {
        Intent intent = new Intent(screen3.this, screen4.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }
}