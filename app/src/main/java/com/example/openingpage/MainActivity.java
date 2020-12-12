package com.example.openingpage;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
     Button selected_sholkas;
     Button completeGita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer ring= MediaPlayer.create(getApplicationContext(), R.raw.sound);
        ring.start();

        selected_sholkas = (Button)findViewById(R.id.button);
        completeGita = (Button) findViewById(R.id.button2);

        completeGita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ChapterList.class);
                startActivity(intent);


            }


        });

        selected_sholkas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),grid.class);
                startActivity(intent);
            }
        });
    }
}