package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void checkExistingOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        //when
        Order isOrder = warehouse.getOrder("1");
        //then
        assertNotNull(isOrder);
    }
/*
    @Test(expected = OrderDoesntExistException.class)
    public void checkNoExistingOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order isOrderExist = warehouse.getOrder("5");
        //then
    }

 */

    @Test
    public void checkNoExistingOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        OrderDoesntExistException exception = assertThrows(OrderDoesntExistException.class,
                ()-> warehouse.getOrder("5"));
        assertEquals("There is no order number: 5", exception.getMessage());
    }
}