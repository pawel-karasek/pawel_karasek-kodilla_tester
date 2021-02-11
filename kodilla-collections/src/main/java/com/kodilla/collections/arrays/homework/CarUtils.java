package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println(car.getName() + " = "+ car.getSpeed());
        System.out.println(car.getSpeedIncrement() + ", " + car.getSpeedDecrement());

    }
}
