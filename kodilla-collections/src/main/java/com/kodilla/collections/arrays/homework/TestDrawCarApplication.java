package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Syrena;

public class TestDrawCarApplication {
    public static void main(String[] args) {

        Car randomSpeed = CarApplication.drawCar();
        System.out.println(randomSpeed.getName() + " = " + randomSpeed.getSpeed());
    }
}
