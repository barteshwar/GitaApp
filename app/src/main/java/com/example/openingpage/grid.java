package com.example.openingpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class grid extends AppCompatActivity {
    GridView gridView;
    String[] numberWord = {"Anger","Fear","Lust","Confusion","Feeling Sinful","Forgiveness","Envy","Forgetfulness","Pride","Greed",
    "Death","Peace","Demotivated","Laziness","Temptation","Depression","Loneliness","Uncontrolled mind","Discriminated","Losing Hope"};
    int[] numImage = {R.drawable.anger,R.drawable.fear,R.drawable.lust,R.drawable.confusion,R.drawable.sin,R.drawable.forgiveness,R.drawable.envy
            ,R.drawable.forgetfulness,R.drawable.pride,R.drawable.greed,R.drawable.death,R.drawable.peace,R.drawable.demotivated,R.drawable.laziness,R.drawable.temptation,R.drawable.depression,R.drawable.loneliness
            ,R.drawable.uncontrolledmind,R.drawable.discriminated,R.drawable.losinghope};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        this.setTitle("Bhagwad Gita For Specific Emotions");
        gridView = (GridView)findViewById(R.id.grid_view);

        MainAdapter adapter = new MainAdapter(grid.this,numberWord,numImage);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),Integer.toString(position),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ShlokaTabsSelected.class);
                intent.putExtra("value",position);
                startActivity(intent);
            }
        });
    }
}