package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    //given
        Item belt = (new Item("belt", 250));
        Item wallet = (new Item("wallet", 450));
        Item keyHolder = (new Item("keyholder", 150));

    @Test
    public void addingNewItemsToInvoice() {
        //when
        int numbersOfItem = invoice.getSize();
        //then
        assertEquals(3, numbersOfItem);
    }

    @Test
    public void shouldReturnNullWhenNegativeIndex() {
        //then
        Item item = invoice.getItem(-1);
        assertNull(item);
    }

    @Test
    public void shouldReturnNullWhenIndexOutOfRange() {
        //when
        Item item = invoice.getItem(1000);
        //then
        assertNull(item);
    }

    @Test
    public void shouldClearInvoice() {
        //when
        invoice.clear();
        //then
        assertEquals(0, invoice.getSize());
    }

    @Test
    public void shouldGetSize() {
        //When
        int size = invoice.getSize();
        //Then
        Assertions.assertEquals(3, size);
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(belt);
        invoice.addItem(wallet);
        invoice.addItem(keyHolder);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
