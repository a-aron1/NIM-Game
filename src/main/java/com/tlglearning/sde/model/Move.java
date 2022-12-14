package com.tlglearning.sde.model;

public class Move {
    private Pile pile;

    private final int quantity;

    private final int pileNumber; //MoveView

    public Move(int pileNumber, int quantity, Pile pile){
        this.pileNumber = pileNumber;
        this.pile = pile;
        this.quantity = quantity;
    }


}