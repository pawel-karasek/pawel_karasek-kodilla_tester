package com.kodilla.mockito.notification.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherAlertServiceTestSuite {
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    IClient client = Mockito.mock(IClient.class);
    IClient client2 = Mockito.mock(IClient.class);
    INotification notification = Mockito.mock(INotification.class);
    ILocation location = Mockito.mock(ILocation.class);

    @Test
    public void shouldAddClientToLocationAlerts() {
        weatherAlertService.addSubscriberToLocation("Warszawa", client);
        weatherAlertService.sendNotificationsToLocationSubscribers("Warszawa", notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveClientFromLocationAlerts() {
        Mockito.when(client.getName()).thenReturn("client");
        weatherAlertService.addSubscriberToLocation("Warszawa", client);
        weatherAlertService.removeSubscriberFromLocation("client", "Warszawa");
        Mockito.verify(client, Mockito.times(3)).getName();
    }

    @Test
    public void shouldRemoveClientFromAllLocationAlerts() {
        /*
        Mockito.when(client.getName()).thenReturn("client");
        Mockito.when(location.getName()).thenReturn("location");
        weatherAlertService.addSubscriberToLocation(location.getName(), client);
        weatherAlertService.removeSubscriberFromAllLocations("client");
        Mockito.verify(location, Mockito.times(1)).getClients();

         */
    }

    @Test
    public void subscribedClientsShouldReceiveOnlySubscribesLocationAlerts() {
        weatherAlertService.addSubscriberToLocation("Warszawa", client);
        weatherAlertService.addSubscriberToLocation("Paryż", client2);
        weatherAlertService.sendNotificationsToLocationSubscribers("Paryż", notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendNotificationsToAllSubscribers() {
        Mockito.when(client.getName()).thenReturn("client");
        Mockito.when(client2.getName()).thenReturn("client2");
        weatherAlertService.addSubscriberToLocation("Warszawa", client);
        weatherAlertService.addSubscriberToLocation("Paryż", client2);
        weatherAlertService.sendNotificationToAllSubscribers(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldDeleteLocation() {
        weatherAlertService.addLocation(new Location("Warszawa"));
        weatherAlertService.addLocation(new Location("Paryż"));
        weatherAlertService.removeLocation("Paryż");
        assertEquals(1, weatherAlertService.locations.size());
    }

}