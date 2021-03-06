package com.kodilla.mockito.notification.homework;

import java.util.*;

public class WeatherAlertService {

    Map<String, ILocation> locations = new HashMap<>();
    Map<String, IClient> clients = new HashMap<>();

    public void addSubscriberToLocation(String locationName, IClient client) {
        if (locations.containsKey(locationName)) {
            locations.get(locationName).addClient(client);
        } else {
            ILocation location = new Location(locationName);
            location.addClient(client);
            locations.put(locationName, location);
        }
        if (!clients.containsKey(client.getName())) {
            clients.put(client.getName(), client);
        }
    }

    public void sendNotificationToAllSubscribers(INotification notification) {
        for (String name : clients.keySet()) {
            IClient client = clients.get(name);
            client.receive(notification);
        }
    }

    public void sendNotificationsToLocationSubscribers(String locationName, INotification notification) {
        if (!locations.containsKey(locationName)) {
            System.out.println("There is no location: " + locationName);
            return;
        }
        ILocation location = locations.get(locationName);
        Map<String, IClient> clients = location.getClients();
        for (String name : clients.keySet()) {
            IClient client = clients.get(name);
            client.receive(notification);
        }
    }

    public void removeSubscriberFromLocation(String clientName, String locationName) {
            ILocation location = locations.get(locationName);
            if(location != null) {
                location.getClients().remove(clientName);
        }
    }

    public void addLocation(ILocation location) {
        locations.put(location.getName(), location);
    }

    public void removeLocation(String locationName) {
        this.locations.remove(locationName);
    }

    public void removeSubscriberFromAllLocations(String clientName) {
        for(String name: locations.keySet()) {
            ILocation location = locations.get(name);
            var _clients = location.getClients();
            location.getClients().remove(clientName);
        }
        clients.remove(clientName);
    }
}
