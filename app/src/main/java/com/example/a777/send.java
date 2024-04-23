package com.example.a777;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class send extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
    }
    public void send2 (View v) {

        Intent intent = new Intent(this, send2.class);
        startActivity(intent);
    }
    public void Right(View v){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    }
