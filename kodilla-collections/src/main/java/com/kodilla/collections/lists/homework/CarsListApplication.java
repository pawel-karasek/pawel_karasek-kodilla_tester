package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Syrena;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Syrena());
        Opel opel = new Opel();
        cars.add(opel);
        cars.add(new Ferrari());

        cars.remove(0);
        cars.remove(opel);

        System.out.println(cars.size());

        for (Car car : cars){
            CarUtils.describeCar(car);
        }
    }
}
