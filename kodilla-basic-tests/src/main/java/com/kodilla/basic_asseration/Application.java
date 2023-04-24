package com.kodilla.basic_asseration;

public class Application {
    public static void main(String[] args) {
        Calculator testSum = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = testSum.sum(a, b);
        boolean correct = ResultChecker.asserEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        System.out.println("");

        Calculator testSubstract = new Calculator();
        int a1 = 5;
        int b1 = 7;
        int substractResult = testSubstract.substract(a1, b1);
        boolean correct2 = ResultChecker.asserEquals(-2, substractResult);

        if(correct2) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a1 + " i " + b1);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a1 + " i " + b1);
        }

        System.out.println("");

        Calculator testSquared = new Calculator();

        int a2 = -4;
        int squaredResult = testSquared.squared(a2);
        boolean correct3 = ResultChecker.asserEquals(16, squaredResult);

        if (correct3) {
            System.out.println("Metoda squared działa poprawnie dla liczby " + a2);
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczby " + a2);
        }


    }
}
