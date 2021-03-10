package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private NotificationService notificationService;
    private DeliveryService deliveryService;

    public ShippingCenter(NotificationService notificationService, DeliveryService deliveryService) {
        this.notificationService = notificationService;
        this.deliveryService = deliveryService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
