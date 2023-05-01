package com.kodilla.abstracts.cwiczenia;

public class Animal2Processor {
    public void process2(Animal2 animal2) {
        System.out.println("Animal has " + animal2.getLegs() + " legs.");
        animal2.giveVoice();
    }
}
