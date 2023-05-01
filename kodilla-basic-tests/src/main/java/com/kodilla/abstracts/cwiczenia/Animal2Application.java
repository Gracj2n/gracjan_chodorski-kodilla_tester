package com.kodilla.abstracts.cwiczenia;

public class Animal2Application {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.giveVoice();

        Duck2 duck2 = new Duck2();
        duck2.giveVoice();

        Animal2 dog3 = new Dog2();
        dog3.giveVoice();

        Animal2Processor process = new Animal2Processor();
        process.process2(duck2);
    }
}
