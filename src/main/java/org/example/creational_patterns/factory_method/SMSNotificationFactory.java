package org.example.creational_patterns.factory_method;

public class SMSNotificationFactory extends NotificationFactory{
    public Notification createNotification(){
        return new SMSNotification();
    }
}
