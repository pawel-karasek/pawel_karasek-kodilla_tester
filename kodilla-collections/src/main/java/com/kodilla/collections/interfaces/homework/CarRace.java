package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Syrena syrena = new Syrena();
            doRace(syrena);

        Opel opel = new Opel();
            doRace(opel);

        Ferrari ferrari = new Ferrari();
            doRace(ferrari);
    }
    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }

}
