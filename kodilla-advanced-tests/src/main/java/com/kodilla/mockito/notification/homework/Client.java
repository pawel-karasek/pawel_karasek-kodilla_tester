package com.kodilla.mockito.notification.homework;

import java.util.ArrayList;
import java.util.List;

public class Client implements IClient {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    List<INotification> notifications = new ArrayList<INotification>();

    public void receive(INotification notification) {
        notifications.add(notification);
    }

    public List<INotification> getNotifications() {

        return notifications;
    }

}
