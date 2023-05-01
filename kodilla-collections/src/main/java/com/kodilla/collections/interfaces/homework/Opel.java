package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;
    private int increase;
    private int decrease;
    @Override
    public int getSpeed() {
        this.speed = 150;
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.increase = 35;
        int sum = increase + getSpeed();
        System.out.println(sum);
    }

    @Override
    public void decreaseSpeed() {
        this.decrease = -15;
        int sum = decrease + getSpeed();
        System.out.println(sum);
    }
}
