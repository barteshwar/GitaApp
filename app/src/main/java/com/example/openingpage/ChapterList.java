package com.example.openingpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ChapterList extends AppCompatActivity {
    String items[] = new String[]{"Chapter 1", "Chapter 2","Chapter 3","Chapter 4","Chapter 5","Chapter 6", "Chapter 7","Chapter 8","Chapter 9","Chapter 10",
            "Chapter 11", "Chapter 12","Chapter 13","Chapter 14","Chapter 15","Chapter 16", "Chapter 17","Chapter 18"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_list);
        this.setTitle("The Complete Bhagwad Gita");
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