package com.kodilla.abstracts.cwiczenia_shape;

public class Prostokat extends Figura{
    private double a;
    private double b;
    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double Pole() {
        double pole = a * b;
        System.out.println("Pole prostokąta: " + pole);
        return pole;
    }

    @Override
    public double Obwod() {
        double obwod = (2 * a) + (2 * b);
        System.out.println("Obwód prostokąta: " + obwod);
        return obwod;
    }
}
