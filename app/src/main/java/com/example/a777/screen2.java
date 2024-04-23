package com.example.a777;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class screen2 extends AppCompatActivity {
    public void Next1(View v) {
        Intent intent = new Intent(screen2.this, screen3.class);
        startActivity(intent);
    }
    public void Skip1(View v) {
        Intent intent = new Intent(screen2.this, screen4.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }
}