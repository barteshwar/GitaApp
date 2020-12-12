package com.example.openingpage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PlansPagerAdapterSelected extends FragmentStatePagerAdapter {
    int numOfTabs;
    int chapter;
    public PlansPagerAdapterSelected(@NonNull FragmentManager fm, int behavior, int chapter) {
        super(fm, behavior);
        numOfTabs = behavior;
        this.chapter = chapter;
    }
    /*
    String[][] shlokas = {{"Chapter1shloka1","C1shloka2", "C1shloka3","C1shloka4","C1shloka5", "C1shloka6","C1shloka7","C1shloka8", "C1shloka9","C1shloka10"},
            {"C2shloka1","C2shloka2", "C2shloka3","C2shloka4","C2shloka5", "C2shloka6","C2shloka7","C2shloka8", "C2shloka9","C2shloka10"},
            {"C3shloka1","C3shloka2", "C3shloka3","C3shloka4","C3shloka5", "C3shloka6","C3shloka7","C3shloka8", "C3shloka9","C3shloka10"}};
    */
    //String[][] shlokas;
    //GitaText gitaText = GitaText.getInstance();
    String[][] shlokas = GitaTextSelected.getInstance().getData();

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return DynamicFragment.newInstance(shlokas[chapter][position]);
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}