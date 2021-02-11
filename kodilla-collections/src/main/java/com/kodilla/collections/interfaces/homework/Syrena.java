package com.kodilla.collections.interfaces.homework;

public class Syrena implements Car{
    private String name = "syrena";
    private int speed = 0;
    private int speedIncrement;
    private int speedDecrement;

    public Syrena() {
        this.speedIncrement = 20;
        this.speedDecrement = 20;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + speedIncrement;
    }
    @Override
    public void decreaseSpeed() {
        speed = speed - speedDecrement;
    }

    @Override
    public int getSpeedIncrement() {
        return speedIncrement;
    }

    @Override
    public int getSpeedDecrement() {
        return speedDecrement;
    }
    @Override
    public String getName() {
        return name;
    }
}
