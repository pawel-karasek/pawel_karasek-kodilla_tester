package com.kodilla.collections.interfaces;

import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double GetArea() {
        return PI * radius *radius;
    }
    public double GetPerimeter() {
        return 2 * PI * radius;
    }
}
