package com.kodilla.Abstracts.homeWork;

public class Square extends Shape {
    double width;

    Square(double width) {
        this.width = width;
    }
    @Override
    public void surfaceArea() {
        System.out.println(width * width);
    }

    @Override
    public void circuit() {
        System.out.println(4 * width);
    }
}
