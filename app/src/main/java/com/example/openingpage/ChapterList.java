package com.example.openingpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ChapterList extends AppCompatActivity {
    String items[] = new String[]{"chapter 1", "chapter 2","chapter 3","chapter 4","chapter 5","chapter 6", "chapter 7","chapter 8","chapter 9","chapter 10",
            "chapter 11", "chapter 12","chapter 13","chapter 14","chapter 15","chapter 16", "chapter 17","chapter 18"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_list);
        ListView listview = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this,items[position],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ShlokaTabsFull.class);
                intent.putExtra("value",position);
                startActivity(intent);

            }
        });
    }
}