package com.kodilla.collections.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {

        Square square = new Square(10.0);
        System.out.println(square.GetArea());
        System.out.println(square.GetPerimeter());

        Circle circle = new Circle(7.0);
        System.out.println(circle.GetArea());
        System.out.println(circle.GetPerimeter());


    }
}
