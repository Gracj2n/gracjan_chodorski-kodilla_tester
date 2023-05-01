package com.kodilla.abstracts.cwiczenia_shape;

public class Trojkat extends Figura{
    private double a;
    private double h;
    public Trojkat(double podstawa, double wysokosc) {
        this.a = podstawa;
        this.h = wysokosc;
    }
    @Override
    public double Pole() {
        double pole = (a * h) / 2;
        System.out.println("Pole trójkąta: " + pole);
        return pole;
    }

    @Override
    public double Obwod() {
        System.out.println("Za mało danych do obliczenia obwodu.");
        return 0;
    }
}
