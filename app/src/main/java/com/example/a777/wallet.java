package com.example.a777;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class wallet extends AppCompatActivity {

    ImageButton imgButton10;
    ImageButton imgButton12;
    ImageButton imgButton14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        imgButton10 = (ImageButton) findViewById(R.id.home);

        imgButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(wallet.this, home.class);
                startActivities(new Intent[]{intent});

            }
        });


            imgButton12 = (ImageButton) findViewById(R.id.track);

            imgButton12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(wallet.this, Track.class);
                    startActivities(new Intent[]{intent});

                }
            });


        imgButton14 = (ImageButton) findViewById(R.id.imageButton16);

        imgButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(wallet.this,profile.class);
                startActivities(new Intent[]{intent});

            }
        });







    }
}

