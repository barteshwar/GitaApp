package com.techbharata.bhagavadgita;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class ShlokaTabsSelected extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shloka_tabs_selected);
        String[] numberWord = {"Anger","Fear","Lust","Confusion","Feeling Sinful","Forgiveness","Envy","Forgetfulness","Pride","Greed",
                "Death","Peace","Demotivated","Laziness","Temptation","Depression","Loneliness","Uncontrolled mind","Discriminated","Losing Hope"};

        Intent intent = getIntent();
        int i = intent.getIntExtra("value",1);

        this.setTitle("Bhagwad Gita on: " + numberWord[i]);

        tab = (TabLayout)findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        tab.setTabMode(TabLayout.MODE_SCROLLABLE);

        GitaTextSelected gitaTextSelected = GitaTextSelected.getInstance();

        String[][] shloka = GitaText.getInstance().getData();
//shloka[1][61], shloka[1][62],shloka[4][25],shloka[15][20],shloka[3][9]
        String[][] shlokas = {{shloka[1][54],shloka[1][60],shloka[1][61],shloka[4][24],shloka[15][15],shloka[3][9]},
                {shloka[3][9],shloka[10][46],shloka[17][61]},
                {shloka[2][36],shloka[2][40],shloka[2][42],shloka[4][20],shloka[15][15]},
                {shloka[1][6],shloka[2][1],shloka[17][56]},
                {shloka[3][35],shloka[3][36],shloka[4][8],shloka[8][29],shloka[9][2],shloka[13][5],shloka[17][61]},
                {shloka[10][40],shloka[11][10],shloka[15][0]},
                {shloka[11][10],shloka[15][13],shloka[17][66]},
                {shloka[14][13],shloka[17][56]},
                {shloka[15][1],shloka[15][9],shloka[17][24],shloka[17][53]},
                {shloka[13][16],shloka[15][15],shloka[16][21]},
                {shloka[1][12],shloka[1][19],shloka[1][21],shloka[1][24],shloka[1][26]},
                {shloka[1][64],shloka[1][69],shloka[3][38],shloka[4][26],shloka[7][27]},
                {shloka[10][30],shloka[17][45],shloka[17][73]},
                {shloka[2][7],shloka[2][19],shloka[5][13],shloka[17][36]},
                {shloka[1][58],shloka[1][59],shloka[1][68],shloka[6][13]},
                {shloka[1][2],shloka[1][13],shloka[4][19]},
                {shloka[5][24],shloka[8][28],shloka[12][9],shloka[12][11]},
                {shloka[5][4],shloka[5][5],shloka[5][20],shloka[5][29]},
                {shloka[4][16],shloka[4][17],shloka[5][26],shloka[8][28]},
                {shloka[3][10],shloka[8][21],shloka[8][33],shloka[17][61],shloka[17][73]}
        };

        gitaTextSelected.setData(shlokas);

        String[][] shloka2;

        shloka2 = GitaTextSelected.getInstance().getData();

        int num_columns = shloka2[i].length;
        String[][] shloka_number ={{"Ch 2 Shloka 56","Ch 2 Shloka 62", "Ch 2 Shloka 63","Ch 5 Shloka 26", "Ch 16 Shloka 21","Ch 4 Shloka 10"},
                {"Ch 4 Shloka 10", "Ch 11 Shloka 50","Ch 18 Verse 66"},
                {"Ch 3 Shloka 37", "Ch 3 Shloka 41","Ch 3 Shloka 43","Ch 5 Shloka 22", "Ch 16 Shloka 21"},
                {"Ch 2 Shloka 7","Ch 3 Shloka 2","Ch 18 Shloka 61"},
                {"Ch 4 Shloka 36", "Ch 4 Shloka 37","Ch 5 Shloka 10","Ch 9 Shloka 30","Ch 10 Shloka 3","Ch 14 Shloka 6","Ch 18 Shloka 66"},
                {"Ch 11 Shloka 44", "Ch 12 Shloka 13-14","Ch 16 Shloka 1-3"},
                {"Ch 12 Shloka 13-14","Ch 16 Shloka 19","Ch 17 Shloka 71"},
                {"Ch 15 Shloka 15","Ch 18 Shloka 61"},
                {"Ch 16 Shloka 4", "Ch 16 Shloka 13-15", "Ch 18 Shloka 26","Ch 18 Shloka 58"},
                {"Ch 14 Shloka 17", "Ch 16 Shloka 21", "Ch 17 Shloka 25"},
                {"Ch 2 Shloka 13", "Ch 2 Shloka 20", "Ch 2 Shloka 22", "Ch 2 Shloka 25","Ch 2 Shloka 27"},
                {"Ch 2 Shloka 66", "Ch 2 Shloka 71", "Ch 4 Shloka 39", "Ch 5 Shloka 29", "Ch 8 Shloka 28"},
                {"Ch 11 Shloka 33", "Ch 18 Shloka 48", "Ch 18 Shloka 78"},
                {"Ch 3 Shloka 8","Ch 3 Shloka 20", "Ch 6 Shloka 16", "Ch 18 Shloka 39"},
                {"Ch 2 Shloka 60","Ch 2 Shloka 61","Ch 2 Shloka 70","Ch 7 Shloka 14"},
                {"Ch 2 Shloka 3", "Ch 2 Shloka 14", "Ch 5 Shloka 21"},
                {"Ch 6 Shloka 30","Ch 9 Shloka 29", "Ch 13 Shloka 16", "Ch 13 Shloka 18"},
                {"Ch 6 Shloka 5","Ch 6 Shloka 6","Ch 6 Shloka 26",  "Ch 6 Shloka 35"},
                {"Ch 5 Shloka 18","Ch 5 Shloka 19","Ch 6 Shloka 32", "Ch 9 Shloka 29"},
                {"Ch 4 Shloka 11","Ch 9 Shloka 22","Ch 9 Shloka 34","Ch 18 Shloka 66","Ch 18 Shloka 78"}};


        for (int k = 0; k< num_columns; k++) {
            tab.addTab(tab.newTab().setText(shloka_number[i][k]));
        }

        PlansPagerAdapterSelected adapter = new PlansPagerAdapterSelected
                (getSupportFragmentManager(), tab.getTabCount(),i);



        viewPager.setAdapter(adapter);

        viewPager.setOffscreenPageLimit(1);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));

        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }
}