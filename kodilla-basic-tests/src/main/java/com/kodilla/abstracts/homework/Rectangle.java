package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    private int a;
    private int b;
    public Rectangle(int a,int b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    @Override
    public int surface() {
        int sa = a * b;
        System.out.println("Rectangle surface: " + sa);
        return sa;
    }

    @Override
    public int circuit() {
        int ca = (2 * a) + (2 * b);
        System.out.println("Rectangle circuit: " + ca);
        return ca;
    }
}
