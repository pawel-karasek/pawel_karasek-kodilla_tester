package com.kodilla.execution_model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class OrderTestSuite {


    @Test
    public void shouldGetOrderDetails() {
        //when
        Order order = new Order(850, LocalDate.now(), "pawel");
        //then
        Assertions.assertEquals(850, order.getOrderValue());
        Assertions.assertEquals(LocalDate.now(), order.getOrderDate());
        Assertions.assertEquals("pawel", order.getUserLogin());
    }

}