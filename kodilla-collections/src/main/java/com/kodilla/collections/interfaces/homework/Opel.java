package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;
    @Override
    public int getSpeed() {
        this.speed = 150;
        return speed;
    }
    @Override
    public void increaseSpeed() {
        int increase = 50 + getSpeed();
        System.out.println("Prędkość zwiększona: " + increase);
    }
    @Override
    public void decreaseSpeed() {
        int decrease = -15 + getSpeed();
        System.out.println("Prędkośc zmniejszona: "+ decrease);
    }
}
