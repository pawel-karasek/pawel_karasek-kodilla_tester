package com.kodilla.mockito.notification.homework;

import java.util.List;

public interface IClient {
    void receive(INotification notification);

    public List<INotification> getNotifications();

    public String getName();

}
