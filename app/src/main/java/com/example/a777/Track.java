package com.example.a777;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Track extends AppCompatActivity {
    public void button5 (View v) {
        Intent intent = new Intent(this, apackege.class);
        startActivity(intent);
    }
    ImageButton imgButton20;
    ImageButton imgButton21;
    ImageButton imgButton22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        imgButton20 = (ImageButton) findViewById(R.id.home);

        imgButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Track.this, home.class);
                startActivities(new Intent[]{intent});

            }
        });


        imgButton21 = (ImageButton) findViewById(R.id.walet);

        imgButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Track.this, wallet.class);
                startActivities(new Intent[]{intent});

            }
        });


        imgButton22 = (ImageButton) findViewById(R.id.imageButton16);

        imgButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Track.this, profile.class);
                startActivities(new Intent[]{intent});

            }
        });



    }
}

