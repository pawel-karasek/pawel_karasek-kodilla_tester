package com.kodilla.mockito.notification.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

class ClientTestSuite {
    Client client;
    INotification notification;

    @BeforeEach
    void setUp() {
        client = new Client("client");
        notification = Mockito.mock(INotification.class);
    }

    @Test
    void shouldReceiveNotifications() {
        client.receive(notification);
        Assertions.assertEquals(1, client.notifications.size());
    }

    @Test
    void shouldGetNotifications() {
        List<INotification> result = client.getNotifications();
        Assertions.assertEquals(client.notifications, result);
    }
}