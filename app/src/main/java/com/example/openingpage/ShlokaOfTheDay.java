package com.example.openingpage;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class ShlokaOfTheDay extends AppCompatActivity {
    TextView chapterAndShloka;
    TextView shlokaText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shloka_of_the_day);
        this.setTitle("Bhagwad Gita: Shloka of the day");
        chapterAndShloka = (TextView)findViewById(R.id.chapterandshloka);
        shlokaText = (TextView)findViewById(R.id.textView2);




        String[][] shlokas;

        shlokas = GitaText.getInstance().getData();

        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);

        int num = day*5 + month*10 + year*10;
        int chapter = num % 18;

        int length = shlokas[chapter].length;

        int shloka = num % length;


        //Random r = new Random();
        //int i1 = r.nextInt(18 - 0) + 0;
        //chapterAndShloka.setText(Integer.toString(i1));

        //Random r2 = new Random();
        //int i2 = r2.nextInt(shlokas[i1].length - 0) + 0;
        chapterAndShloka.setText("Chapter "+(chapter+1)+" Shloka "+shloka);
        shlokaText.setText(shlokas[chapter][shloka]);
    }
}