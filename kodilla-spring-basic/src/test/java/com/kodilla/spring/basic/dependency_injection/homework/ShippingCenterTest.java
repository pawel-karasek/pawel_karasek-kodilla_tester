package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShippingCenterTest {
    DeliveryService deliveryService = new DeliveryService();
    NotificationService notificationService = new NotificationService() {
        @Override
        public void success(String address) {

        }

        @Override
        public void fail(String address) {

        }
    };

    ShippingCenter shippingCenter = new ShippingCenter(notificationService, deliveryService);

    @Test
    void shouldSendPackage() {
        shippingCenter.sendPackage("Wronia 5/17", 5.2);
    }

    @Test
    void shouldNotSendPackage() {
        shippingCenter.sendPackage("Dmowskiego 22", 34);
    }
}