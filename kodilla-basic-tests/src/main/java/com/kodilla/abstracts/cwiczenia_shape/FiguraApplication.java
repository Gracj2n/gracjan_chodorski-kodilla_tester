package com.kodilla.abstracts.cwiczenia_shape;

public class FiguraApplication {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(4);
        kwadrat.Obwod();
        kwadrat.Pole();

        System.out.println();

        Prostokat prostokat = new Prostokat(4, 2);
        prostokat.Pole();
        prostokat.Obwod();

        System.out.println();

        Trojkat trojkat = new Trojkat(4, 5);
        trojkat.Pole();
        trojkat.Obwod();

    }
}
