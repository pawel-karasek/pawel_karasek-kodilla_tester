package com.kodilla.execution_model;

import java.time.LocalDate;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String userLogin;

    public Order(double orderValue, LocalDate orderDate, String userLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.userLogin = userLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getUserLogin() {
        return userLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate='" + orderDate + '\'' +
                ", userLogin='" + userLogin + '\'' +
                '}';
    }

}
