package com.kodilla.Abstracts.homeWork;

public class ShapeApplication {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        circle.circuit();
        circle.surfaceArea();

        Shape square = new Square(4);
        square.circuit();
        square.surfaceArea();

        Shape triangle = new Triangle(6, 5);
        triangle.circuit();
        triangle.surfaceArea();
    }
}
