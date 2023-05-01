package com.kodilla.collections.interfaces;

public class Triangle implements Shape{
    private double width;
    private double heigt;
    private double hypotenuse;
    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.heigt = height;
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double getArea() {
        return (width * heigt) / 2;
    }

    @Override
    public double getPerimeter() {
        return width + heigt + hypotenuse;
    }
}
