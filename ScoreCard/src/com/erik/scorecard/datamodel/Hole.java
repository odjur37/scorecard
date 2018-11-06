package com.erik.scorecard.datamodel;

public class Hole {
    private int score;
    private boolean fairway;
    private boolean green;
    private int putts;
    private boolean upnd;

    public Hole() {
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setFairway(boolean fairway) {
        this.fairway = fairway;
    }

    public void setGreen(boolean green) {
        this.green = green;
    }

    public void setPutts(int putts) {
        this.putts = putts;
    }

    public void setUpnd(boolean upnd) {
        this.upnd = upnd;
    }
}
