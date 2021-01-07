package com.techbharata.bhagavadgita;


public class GitaText {
    private static GitaText instance;

    // Global variable
    private int data;
    private String[][] shlokas;

    // Restrict the constructor from being instantiated
    private GitaText(){}

    public void setData(String[][] shlokas){
        this.shlokas=shlokas;
    }
    public String[][] getData(){
        return this.shlokas;
    }

    public static synchronized GitaText getInstance(){
        if(instance==null){
            instance=new GitaText();
        }
        return instance;
    }
}
