package com.kodilla.stream.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Warehouse {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> o = orderList
                .stream()
                .filter(order -> order.number == number)
                .findFirst();
        if (o.isEmpty()) {
            throw new OrderDoesntExistException("There is no order number: " + number);
        }
        return o.get();
    }
}
