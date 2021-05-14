package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

class OrderTest {

    Order order = new Order("1122334455", "wallet", 2);

    @Test
    void shouldGetOrderNumber() {
        System.out.println(order.getOrderNumber());
    }

    @Test
    void shouldGetProductName() {
        System.out.println(order.getProductName());
    }

    @Test
    void shouldGetQuantity() {
        System.out.println(order.getQuantity());
    }
}