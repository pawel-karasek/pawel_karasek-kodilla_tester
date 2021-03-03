package com.kodilla.execution_model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    List<Order> orders = new ArrayList<>();

    public void addNewOrder(Order order) {
        orders.add(order);
    }

    public List<Order> createOrderListByDateRange(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(o -> o.getOrderDate().isBefore(to))
                .filter(o -> o.getOrderDate().isAfter(from))
                .collect(Collectors.toList());
    }

    public List<Order> getLowestValueOrder() {
        double min = orders.stream()
                .mapToDouble(Order::getOrderValue)
                .min().getAsDouble();
        return orders.stream()
                .filter(o -> o.getOrderValue() == min)
                .collect(Collectors.toList());
    }

    public List<Order> getHighestValueOrder() {
        double max = orders.stream()
                .mapToDouble(Order::getOrderValue)
                .max().getAsDouble();
        return orders.stream()
                .filter(o -> o.getOrderValue() == max)
                .collect(Collectors.toList());
    }

    public int getCountOfOrders() {
        return orders.size();
    }

    public double getSumOrders() {
        double sum = 0;
        for (Order order : orders) {
            sum+= order.getOrderValue();
        }
        return sum;
    }
}