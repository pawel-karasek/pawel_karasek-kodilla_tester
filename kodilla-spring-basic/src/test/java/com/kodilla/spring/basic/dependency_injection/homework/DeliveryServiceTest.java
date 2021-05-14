package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeliveryServiceTest {

    DeliveryService deliveryService = new DeliveryService();

    @Test
    void shouldDeliverPackage() {
        boolean happyPath = deliveryService.deliverPackage("wronia 5/17", 5.5);
        Assertions.assertTrue(happyPath, String.valueOf(true));
    }

    @Test
    void shouldNotDeliverPackage() {
        boolean sadPath = deliveryService.deliverPackage("wronia 5/17", 35.5);
        Assertions.assertFalse(sadPath, String.valueOf(false));
    }

    @Test
    void succesPath() {
        deliveryService.success("Wronia 5/17");
    }

    @Test
    void failPath() {
        deliveryService.fail("Dmowskiego 22");
    }
}