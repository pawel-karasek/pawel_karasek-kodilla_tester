package com.kodilla.mockito.notification.homework;

import java.util.HashMap;
import java.util.Map;

public class Location implements ILocation {
    private String name;

    Map<String, IClient> clients = new HashMap<>();

    public Location(String name) {
        this.name = name;
    }

    public void addClient(IClient client) {
        clients.put(client.getName(), client);
    }

    public String getName() {
        return name;
    }

    public Map<String, IClient> getClients() {
        return clients;
    }
}
