package com.kodilla.execution_model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

class ShopTestSuite {
        Shop shop;

    @BeforeEach
    void setUp() {
        //Given
        shop = new Shop();
        shop.orders.add(new Order(111, LocalDate.of(2021, 02, 20), "pawel"));
        shop.orders.add(new Order(222, LocalDate.of(2021, 03, 9), "bartek"));
        shop.orders.add(new Order(333, LocalDate.of(2021, 04, 13), "marta"));

    }

    @Test
    public void shouldCreateOrderListByDateRange() {
        //when
        List<Order> filtered = shop.createOrderListByDateRange(LocalDate.of(2021, 03, 01), LocalDate.of(2021, 04, 23));
        //Then
        Assertions.assertEquals(2, filtered.size());
    }

    @Test
    public void shouldGetLowestValueOrder() {
        //When
        List<Order> lowest = shop.getLowestValueOrder();
        //Then
        Assertions.assertEquals(111, lowest.get(0).getOrderValue());
    }

    @Test
    public void shouldGetHighestValueOrder() {
        //When
        List<Order> highest = shop.getHighestValueOrder();
        //Then
        Assertions.assertEquals(333, highest.get(0).getOrderValue());
    }

    @Test
    public void shouldGetCountOfOrders() {
        //When
        int count = shop.getCountOfOrders();
        //Then
        Assertions.assertEquals(3, count);
    }

    @Test
    void shouldGetSumOrders() {
        //When
        double sum = shop.getSumOrders();
        //Then
        Assertions.assertEquals(666, sum);
    }
}