package com.tlglearning.sde.model;

public class Tally {

    private int wins;

    private int losses;

//    public Tally() {
//        wins = 0;
//        losses = 0;
//    }

    public void win() {
        wins++;
    }
    public void lose() {
        losses++;
    }
    public int getWins() {
        return wins;
    }
    public int getLosses() {
        return losses;
    }
    public int getTotal() {
        return wins+losses;
    }
}