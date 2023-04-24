package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int a;
    private int b;
    public Square(int a, int b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }
    @Override
    public int surface() {
        int sa = a * a;
        System.out.println("Square surface: " + sa);
        return sa;
    }
    @Override
    public int circuit() {
        int ca = 4 * a;
        System.out.println("Square circuit: " + ca);
        return ca;
    }

}
