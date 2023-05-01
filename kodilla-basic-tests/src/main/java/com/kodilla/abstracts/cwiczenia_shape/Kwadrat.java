package com.kodilla.abstracts.cwiczenia_shape;

public class Kwadrat extends Figura {
    private double a;
    public Kwadrat(double a) {
        this.a = a;
    }
    @Override
    public double Pole() {
        double pole = a * a;
        System.out.println("Pole kwadratu: " + pole);
        return pole;
    }

    @Override
    public double Obwod() {
        double obwod = 4 * a;
        System.out.println("Obwód kwadratu: " + obwod);
        return obwod;
    }
}
