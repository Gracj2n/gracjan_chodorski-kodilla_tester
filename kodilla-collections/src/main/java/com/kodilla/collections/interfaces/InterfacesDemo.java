package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10);
        showShapeDetails(square);

        System.out.println();

        Circle circle = new Circle(7);
        showShapeDetails(circle);

        System.out.println();

        Triangle triangle = new Triangle(6,4,7.211);
        showShapeDetails(triangle);

    }
    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
