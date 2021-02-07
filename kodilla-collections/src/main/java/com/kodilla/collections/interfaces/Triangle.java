package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape{
    private double width;
    private double high;
    private double hypotenuse;

    public Triangle(double width, double high, double hypotenuse) {
        this.width = width;
        this.high = high;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return width * high /2;
    }

    @Override
    public double getPerimeter() {
        return width + high + hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", high=" + high +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.width, width) == 0 && Double.compare(triangle.high, high) == 0 && Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, high, hypotenuse);
    }
}
