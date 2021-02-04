package com.kodilla.collections.interfaces;

public class Square {
    private double width;

    public Square(double width) {
        this.width = width;
    }
    public double GetArea() {
        return width * width;
    }
    public double GetPerimeter() {
        return width * 4;
    }
}
