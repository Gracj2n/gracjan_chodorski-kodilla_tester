package com.kodilla.abstracts.cwiczenia;

public class Duck2 extends Animal2{
    public Duck2() {
        super(2);
    }
    @Override
    public void giveVoice() {
        System.out.println("Qwa Qwa");
    }
}
