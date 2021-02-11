package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Syrena;

import java.util.Random;

public class CarApplication {
    private static Car[] cars = {new Syrena(), new Opel(), new Ferrari()};


    public static Car drawCar() {

        Random random = new Random();
        int carIndex = random.nextInt(3);
        int increments = random.nextInt(5);

        Car car = cars[carIndex];
        for (int i = 0; i < increments; i++) {
        car.increaseSpeed();
        }
        return car;
    }
}
