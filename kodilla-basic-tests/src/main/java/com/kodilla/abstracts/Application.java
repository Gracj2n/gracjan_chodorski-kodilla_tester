package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();

        System.out.println("");

        AnimalProcessor animalprocessor = new AnimalProcessor();
        animalprocessor.processor(dog);

        System.out.println("");

        AnimalProcessor animalprocessor1 = new AnimalProcessor();
        animalprocessor1.processor(duck);

    }
}
