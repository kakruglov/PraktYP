package com.example.a777;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class home extends AppCompatActivity {

    public void Chats (View v){
        Intent intent = new Intent(this, chats.class);
        startActivity(intent);
    }
    ImageButton imgButton4;
    ImageButton imgButton5;
    ImageButton imgButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgButton4 = (ImageButton) findViewById(R.id.ImageButton4);

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(home.this, wallet.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton5 = (ImageButton) findViewById(R.id.track);

        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(home.this, Track.class);
                startActivities(new Intent[]{intent});

            }
        });
        imgButton6 = (ImageButton) findViewById(R.id.imageButton16);

        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(home.this, profile.class);
                startActivities(new Intent[]{intent});

            }
        });


    }




    }






