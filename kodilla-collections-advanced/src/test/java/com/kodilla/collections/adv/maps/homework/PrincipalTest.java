package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

class PrincipalTest {

    Principal principal = new Principal("pawel", "karasek");

    @Test
    void shouldGetFirstNameAndLastName() {
        System.out.println(principal.getFirstName() + " " + principal.getLastName());
    }
}