package com.kodilla.abstracts.homeWork;

public class Circle extends Shape {
    static double PI = 3.1415927;
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public void surfaceArea() {
        System.out.println(PI * r * r);
    }

    @Override
    public void circuit() {
        System.out.println(2 * PI * r);
    }

}
