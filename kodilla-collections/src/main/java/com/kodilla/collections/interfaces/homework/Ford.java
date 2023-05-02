package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    @Override
    public int getSpeed() {
        this.speed = 160;
        return speed;
    }
    @Override
    public void increaseSpeed() {
        int increase = 30 + getSpeed();
        System.out.println("Prędkość zwiększona: " + increase);
    }
    @Override
    public void decreaseSpeed() {
        int decrease = -20 + getSpeed();
        System.out.println("Prędkośc zmniejszona: "+ decrease);
    }
}


