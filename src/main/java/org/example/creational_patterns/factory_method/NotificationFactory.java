package org.example.creational_patterns.factory_method;

public abstract class NotificationFactory {
    abstract Notification createNotification();

    public void sendNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }

}
