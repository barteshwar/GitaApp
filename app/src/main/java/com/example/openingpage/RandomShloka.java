package com.example.openingpage;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class RandomShloka extends AppCompatActivity {
    TextView chapterAndShloka;
    TextView shlokaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_shloka);
        this.setTitle("Bhagwad Gita: Random Shloka");
        chapterAndShloka = (TextView)findViewById(R.id.chapterandshloka);
        shlokaText = (TextView)findViewById(R.id.textView2);




        String[][] shlokas;

        shlokas = GitaText.getInstance().getData();

        Random r = new Random();
        int i1 = r.nextInt(18 - 0) + 0;
        //chapterAndShloka.setText(Integer.toString(i1));

        Random r2 = new Random();
        int i2 = r2.nextInt(shlokas[i1].length - 0) + 0;
        chapterAndShloka.setText("Chapter "+(i1+1)+" Shloka "+i2);
        shlokaText.setText(shlokas[i1][i2]);


    }


}