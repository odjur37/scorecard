package com.erik.scorecard.datamodel;

public class Hole {
    private int holeNo;
    private int score;
    private boolean fairway;
    private boolean green;
    private int putts;
    private boolean upnd;

    public Hole() {
    }

    public Hole(int holeNo){
        this.holeNo = holeNo;
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

    public int getHoleNo() {
        return holeNo;
    }

    public int getScore() {
        return score;
    }

    public boolean isFairway() {
        return fairway;
    }

    public boolean isGreen() {
        return green;
    }

    public int getPutts() {
        return putts;
    }

    public boolean isUpnd() {
        return upnd;
    }

    public void setHoleNo(int no){
        this.holeNo = no;
    }
}
