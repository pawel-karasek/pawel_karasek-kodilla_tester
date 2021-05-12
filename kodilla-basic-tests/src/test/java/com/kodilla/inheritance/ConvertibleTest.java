package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

class ConvertibleTest {

    Convertible convertible = new Convertible(4, 2);

    @Test
    void shouldOpenAndCloseRoof() {
        convertible.openRoof();
        convertible.closeRoof();
    }
}