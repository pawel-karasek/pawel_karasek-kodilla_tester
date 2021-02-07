package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Syrena syrena = new Syrena(60, 1.1, 0.85);
            showCarDetails(syrena);

        Opel opel = new Opel(60, 2.5, 0.7);
            showCarDetails(opel);

        Ferrari ferrari = new Ferrari(60, 3.2, 0.5);
            showCarDetails(ferrari);
    }
    private static void showCarDetails(Car car) {
        System.out.println(car.getSpeed());
        car.increaseSpeed();
        car.decreaseSpeed();
    }
    private static void showSyrenaDetails(Syrena syrena) {
        System.out.println(syrena.getSpeed());
        syrena.increaseSpeed();
        syrena.decreaseSpeed();
    }
    private static void showOpelDetails(Opel opel) {
        System.out.println(opel.getSpeed());
        opel.increaseSpeed();
        opel.decreaseSpeed();
    }
    private static void showFerrariDetails(Ferrari ferrari) {
        System.out.println(ferrari.getSpeed());
        ferrari.increaseSpeed();
        ferrari.decreaseSpeed();
    }
}
