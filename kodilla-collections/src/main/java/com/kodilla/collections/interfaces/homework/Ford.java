package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    private int increase;
    private int decrease;

    @Override
    public int getSpeed() {
        this.speed = 160;
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.increase = 30;
        int sum = increase + getSpeed();
        System.out.println(sum);
    }

    @Override
    public void decreaseSpeed() {
        this.decrease = -20;
        int sum = decrease + getSpeed();
        System.out.println(sum);
    }
}


