package org.example.creational_patterns.factory_method;

public class FactoryMethodMain {
    public static void startExecution(String notify){
        Notification notification = null;

         if(notify.equals("email")) notification = new EmailNotification();
         else if(notify.equals("sms")) notification = new SMSNotification();

        assert notification != null;
        notification.notifyUser();
    }
}
