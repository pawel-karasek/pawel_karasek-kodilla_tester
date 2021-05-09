package com.kodilla.execution_model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTestSuite {

    Invoice invoice = new Invoice();
    Item wallet = (new Item("wallet", 450));

    @Test
    public void shouldGetWalletAndPrice() {
        //when
        invoice.getItem(1);
        //then
        assertEquals("wallet", wallet.getName());
        assertEquals(450, wallet.getPrice());
    }

}