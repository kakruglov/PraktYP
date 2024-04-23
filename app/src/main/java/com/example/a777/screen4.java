package com.example.a777;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class screen4 extends AppCompatActivity {


        public void SignIn(View v) {
            Intent intent = new Intent(this, screen6.class);
            startActivity(intent);
        }
        public void SignUp(View v) {
            Intent intent = new Intent(this, screen5.class);
            startActivity(intent);
        }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }
}
