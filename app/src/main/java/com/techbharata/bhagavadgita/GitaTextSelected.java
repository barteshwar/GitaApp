package com.techbharata.bhagavadgita;


public class GitaTextSelected {
    private static GitaTextSelected instance;

    // Global variable
    private int data;
    private String[][] shlokas;

    // Restrict the constructor from being instantiated
    private GitaTextSelected(){}

    public void setData(String[][] shlokas){
        this.shlokas=shlokas;
    }
    public String[][] getData(){
        return this.shlokas;
    }

    public static synchronized GitaTextSelected getInstance(){
        if(instance==null){
            instance=new GitaTextSelected();
        }
        return instance;
    }
}
