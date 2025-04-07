package org.example.creational_patterns.factory_method;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser(){
        System.out.println("Notified through email");
    }
}
