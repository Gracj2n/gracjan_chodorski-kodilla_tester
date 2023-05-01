package com.kodilla.abstracts.cwiczenia;

public abstract class Animal2 {
    private int legs;
    public Animal2(int legs) {
        this.legs = legs;
    }
    public int getLegs() {
        return legs;
    }
    public abstract void giveVoice();
}
