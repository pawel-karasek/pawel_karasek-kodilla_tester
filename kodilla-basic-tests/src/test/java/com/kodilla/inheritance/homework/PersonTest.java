package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

class PersonTest {
    Person person = new Person("pawel", 35, new Programmer(5000));

    @Test
    void shouldPrintPerson() {
        person.printPerson();
    }
}