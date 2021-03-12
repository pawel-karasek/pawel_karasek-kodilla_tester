package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldAcceptPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean acceptPackage = bean.deliverPackage("Polna 11", 28);
        Assertions.assertTrue(acceptPackage == true);
    }

    @Test
    public void shouldRejectPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean acceptPackage = bean.deliverPackage("Polna 11", 28);
        Assertions.assertFalse(acceptPackage == false);
    }

    @Test
    public void shouldSendPackageSuccessfully() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sendPackage = bean.sendPackage("Polna 11", 28);
        Assertions.assertEquals("Package delivered to: Polna 11", sendPackage);
    }

    @Test
    public void shouldSendPackageFaulty() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sendPackage = bean.sendPackage("Polna 11", 31);
        Assertions.assertEquals("Package not delivered to: Polna 11", sendPackage);
    }

}