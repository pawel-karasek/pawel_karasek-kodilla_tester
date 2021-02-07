package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    private int speed;
    private double engine;
    private double breakes;

    public Opel(int speed, double engine, double breakes) {
        this.speed = speed;
        this.engine = engine;
        this.breakes = breakes;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed * engine);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed * breakes);
    }
}
