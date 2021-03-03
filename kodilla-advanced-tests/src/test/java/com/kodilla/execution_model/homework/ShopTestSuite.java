package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Order;
import com.kodilla.execution_model.Shop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {
    private Shop shop = new Shop();

    @BeforeEach
    public void init() {
        shop.addNewOrder(new Order(124.99, LocalDate.of(2021, 02, 03), "pawel"));
        shop.addNewOrder(new Order(54.99, LocalDate.of(2021, 02, 20), "wojtek"));
        shop.addNewOrder(new Order(426.99, LocalDate.of(2021, 02, 14), "michal"));
        shop.addNewOrder(new Order(299.99, LocalDate.of(2021, 02, 27), "marta"));
        shop.addNewOrder(new Order(54.99, LocalDate.of(2021, 02, 18), "beata"));
    }

    @Test
    public void shouldCreateOrderListByDateRange() {
        //when
        List<Order> result = shop.createOrderListByDateRange(LocalDate.of(2021, 02, 13), LocalDate.of(2021, 02, 19));
        //then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldGetLowestValueOrder() {
        //when
        List<Order> result = shop.getLowestValueOrder();
        //then
        assertEquals(54.99, result.get(0).getOrderValue());
    }

    @Test
    public void shouldGetHighestValueOrder() {
        //when
        List<Order> result = shop.getHighestValueOrder();
        //then
        assertEquals(426.99, result.get(0).getOrderValue());
    }

    @Test
    public void shouldGetCountOfOrders() {
        //when
        int result = shop.getCountOfOrders();
        //then
        assertEquals(5, result);
    }

    @Test
    public void shouldGetSumOrders() {
        //when
        double result = shop.getSumOrders();
        //then
        assertEquals(961.95, result);
    }
}
