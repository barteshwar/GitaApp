package com.example.openingpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ChapterList extends AppCompatActivity {
    String items[] = new String[]{"\nChapter 1 \nObserving the armies on the battlefield of Kurukshetra\n",
            "\nChapter 2 \nContents of the Gita summarized\n",
            "\nChapter 3 \nKarma-yoga\n",
            "\nChapter 4 \nTranscendental Knowledge\n",
            "\nChapter 5 \nKarma-yoga-Action in Krsna Consciousness\n",
            "\nChapter 6 \nSankhya-yoga\n",
            "\nChapter 7 \nKnowledge of the Absolute\n",
            "\nChapter 8 \nAttaining the Supreme\n",
            "\nChapter 9 \nThe Most Confidential Knowledge\n",
            "\nChapter 10 \nThe Opulence of the Absolute\n",
            "\nChapter 11 \nThe Universal Form\n",
            "\nChapter 12 \nDevotional Service\n",
            "\nChapter 13 \nNature, the Enjoyer, and Consciousness\n",
            "\nChapter 14 \nThe Three Modes of Material Nature\n",
            "\nChapter 15 \nThe Yoga of the Supreme Person\n",
            "\nChapter 16 \nThe Divine and Demoniac Natures\n",
            "\nChapter 17 \nThe Divisions of Faith\n",
            "\nChapter 18 \nConclusion - The Perfection of Renunciation\n"};

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