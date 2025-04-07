package org.example.creational_patterns.factory_method;

public class SMSNotification implements Notification{

    public void notifyUser(){
        System.out.println("Notified through SMS");
    }
}
