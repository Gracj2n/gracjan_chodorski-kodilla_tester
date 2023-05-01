package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car{
    private int speed;
    private int increase;
    private int decrease;
    @Override
    public int getSpeed() {
        this.speed = 180;
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.increase = 40;
        int sum = increase + getSpeed();
        System.out.println(sum);
    }

    @Override
    public void decreaseSpeed() {
        this.decrease = -10;
        int sum = decrease + getSpeed();
        System.out.println(sum);
    }
}
