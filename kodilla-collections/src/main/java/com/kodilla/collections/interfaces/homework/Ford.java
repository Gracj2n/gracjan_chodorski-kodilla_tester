package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    @Override
    public int getSpeed(int speed) {
        this.speed = speed;
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed = speed + 30;
        System.out.println("Prędkość zwiększona: " + speed);
    }
    @Override
    public void decreaseSpeed() {
        speed = speed -20;
        System.out.println("Prędkośc zmniejszona: "+ speed);
    }
}


