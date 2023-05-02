package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car{
    private int speed;
    @Override
    public int getSpeed() {
        this.speed = 180;
        return speed;
    }
    @Override
    public void increaseSpeed() {
        int increase = 20 + getSpeed();
        System.out.println("Prędkość zwiększona: " + increase);
    }
    @Override
    public void decreaseSpeed() {
        int decrease = -10 + getSpeed();
        System.out.println("Prędkośc zmniejszona: "+ decrease);
    }
}
