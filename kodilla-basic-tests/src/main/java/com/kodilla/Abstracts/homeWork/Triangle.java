package com.kodilla.Abstracts.homeWork;

public class Triangle extends Shape {
    private double h;
    private double width;

    Triangle(double h, double width) {
        this.h = h;
        this.width = width;
    }
    @Override
    public void surfaceArea() {
        System.out.println((width/2) * h);
    }

    @Override
    public void circuit() {
        System.out.println(3 * width);
    }
}
