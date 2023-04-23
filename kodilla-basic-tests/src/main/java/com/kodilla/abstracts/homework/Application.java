package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(4, 4);                  //Podaj długość boku a dla kwadratu
        square.surface();
        square.circuit();

        System.out.println("");

        Rectangle rectangle = new Rectangle(4,2);          //Podaj długość boków a i b dla prostokąta
        rectangle.surface();
        rectangle.circuit();
    }
}
