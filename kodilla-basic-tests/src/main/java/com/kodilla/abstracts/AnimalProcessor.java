package com.kodilla.abstracts;

public class AnimalProcessor {
    public void processor(Animal animal) {
        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs.");
        animal.giveVoice();
    }
}
