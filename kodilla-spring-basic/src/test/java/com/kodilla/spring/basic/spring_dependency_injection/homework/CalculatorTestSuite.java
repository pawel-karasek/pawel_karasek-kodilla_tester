package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldReturnValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Display bean = context.getBean(Display.class);
        Double result = bean.display(4);
        Assertions.assertNotNull(result);
    }

    @Test
    public void shouldReturnResultOfAdding() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(4, 2);
        Assertions.assertEquals(6, 6);
    }

    @Test
    public void shouldReturnResultOfsubstract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.substract(4, 2);
        Assertions.assertEquals(2, 2);
    }

    @Test
    public void shouldReturnResultOfMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(4, 2);
        Assertions.assertEquals(8, 8);
    }

    @Test
    public void shouldReturnResultOfDivided() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divided(4, 2);
        Assertions.assertEquals(2, 2);
    }
}