package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService extends NotificationService {

    @Override
    public String success(String address) {
        return super.success(address);
    }

    @Override
    public String fail(String address) {
        return super.fail(address);
    }

    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            return false;
        }
        return true;
    }
}
