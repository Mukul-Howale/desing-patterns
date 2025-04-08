package org.example.creational_patterns.factory_method;

public class EmailNotificationFactory extends NotificationFactory{

    public Notification createNotification(){
        return new EmailNotification();
    }
}
