package com.example.a777;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class profile extends AppCompatActivity {

    public void caard (View v) {

        Intent intent = new Intent(this, card.class);
        startActivity(intent);
    }
    public void Statements (View v) {

        Intent intent = new Intent(this, send.class);
        startActivity(intent);
    }
    public void Notification (View v) {

        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }
    ImageButton imgButton30;
    ImageButton imgButton31;
    ImageButton imgButton32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imgButton30 = (ImageButton) findViewById(R.id.home);

        imgButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(profile.this, home.class);
                startActivities(new Intent[]{intent});

            }
        });


        imgButton31 = (ImageButton) findViewById(R.id.ImageButton4);

        imgButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(profile.this, wallet.class);
                startActivities(new Intent[]{intent});

            }
        });


        imgButton32 = (ImageButton) findViewById(R.id.track);

        imgButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(profile.this, Track.class);
                startActivities(new Intent[]{intent});

            }
        });



    }
}

