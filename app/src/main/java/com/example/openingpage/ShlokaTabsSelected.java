package com.example.openingpage;

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
        Intent intent = getIntent();
        int i = intent.getIntExtra("value",1);

        tab = (TabLayout)findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        tab.setTabMode(TabLayout.MODE_SCROLLABLE);

        GitaTextSelected gitaTextSelected = GitaTextSelected.getInstance();

        String[][] shlokas = {{"SChapter1shloka1","SC1shloka2", "SC1shloka3"},
                {"SC2shloka1","SC2shloka2"},
                {"SC3shloka1","SC3shloka2", "SC3shloka3","SC3shloka4","SC3shloka5", "SC3shloka6","SC3shloka7","SC3shloka8"}};

        gitaTextSelected.setData(shlokas);

        String[][] shloka2;

        shloka2 = GitaTextSelected.getInstance().getData();

        int num_columns = shloka2[i].length;


        for (int k = 1; k<= num_columns; k++) {
            tab.addTab(tab.newTab().setText("Shloka " + k));
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