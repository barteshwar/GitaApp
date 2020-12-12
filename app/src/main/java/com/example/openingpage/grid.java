package com.example.openingpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class grid extends AppCompatActivity {
    GridView gridView;
    String[] numberWord = {"Anger","Fear","Lust","Confusion","Feeling Sinful","Forgiveness","Envy","Forgetfulness","Pride","Greed"};
    int[] numImage = {R.drawable.calendar,R.drawable.monitor,R.drawable.checkmark,R.drawable.cut,R.drawable.gift,R.drawable.location,R.drawable.play
            ,R.drawable.truck,R.drawable.wifi,R.drawable.www};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        gridView = (GridView)findViewById(R.id.grid_view);

        MainAdapter adapter = new MainAdapter(grid.this,numberWord,numImage);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),Integer.toString(position),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ShlokaTabsSelected.class);
                intent.putExtra("value",position);
                startActivity(intent);
            }
        });
    }
}