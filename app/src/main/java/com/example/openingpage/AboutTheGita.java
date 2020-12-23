package com.example.openingpage;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutTheGita extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_gita);

        this.setTitle("About The Bhagavad Gita");

        text = (TextView)findViewById(R.id.textView);
        text.setText("The Bhagavad Gita (“Song of God” or “Song of the Lord”) is among the most important religious texts of Hinduism. It has 700 shlokas, and is part of the epic Mahabharata (chapters 23–40 of Bhishma Parva).\n" +
                "\n" +
                "The Gita is a dialogue between the Pandava price Arjuna and the god Krishna who is serving as his charioteer at the Battle of Kurukshetra. The battle is being fought between Arjuna’s family and allies (the Pandavas) and those of the prince Duryodhana and his family (the Kauravas) and their allies. \n" +
                "\n" +
                "The Kauravas and Pandavas are related and there are mutual friends and family members fighting on both sides for supremacy of rule. Accordingly, when Arjuna sees all his former friends and comrades on the opposing side, he loses heart and refuses to take part in a battle which will result in their deaths as well as many others. The rest of the text is the dialogue between the prince and the god on what constitutes right action, proper understanding and, ultimately, the meaning of life and nature of the Divine.\n" +
                "\n" +
                "The Bhagavad Gita presents a synthesis of Hindu ideas about dharma, theistic bhakti, and the yogic ideals of moksha. It is one of the most significant texts in human history.\n\n");
    }
}