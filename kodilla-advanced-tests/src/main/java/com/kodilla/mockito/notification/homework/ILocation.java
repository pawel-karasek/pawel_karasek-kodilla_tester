package com.kodilla.mockito.notification.homework;

import java.util.List;
import java.util.Map;

public interface ILocation {

    public Map<String, IClient> getClients();

    public void addClient(IClient client);

    public String getName();
}
