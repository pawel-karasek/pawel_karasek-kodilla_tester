package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car{
    private String name = "Ferrari";
    private int speed;
    private int speedIncrement;
    private int speedDecrement;

    public Ferrari() {
        this.speedIncrement = 50;
        this.speedDecrement = 30;
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
