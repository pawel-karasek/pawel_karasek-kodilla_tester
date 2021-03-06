package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTestSuite {

    MobilePhone phone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(phone.needsCharging());
        Assertions.assertEquals(0.0, phone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Assertions.assertFalse(phone.needsCharging());
        Mockito.when(phone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(phone.needsCharging());
    }

    @Test
    public void shouldCallLaunchApplication() {
        phone.launchApplication("Tetris4D");
        Mockito.verify(phone).launchApplication("Tetris4D");
    }
}