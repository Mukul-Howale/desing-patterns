package org.example.creational_patterns.factory_method;

public class FactoryMethodMain {
    public static void startExecution(String notify){
        try {
            NotificationFactory notificationFactory = null;

            if(notify.equals("email")) notificationFactory = new EmailNotificationFactory();
            else if(notify.equals("sms")) notificationFactory = new SMSNotificationFactory();

            assert notificationFactory != null;
            notificationFactory.sendNotification();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
