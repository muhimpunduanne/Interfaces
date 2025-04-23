//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NotificationService pushNotification = new pushNotification("deviceID 10") ;
        pushNotification.sendNotification("Hello World");
        pushNotification.setDefaultPriority("high");


        NotificationService emailNotification = new EmailNotification();
        emailNotification.sendNotification("muhammad@gmail.com");

        NotificationService smsNotification = new SMSNotification();
        smsNotification.sendNotification("Hello am muhammad@gmail.com");


    }
}

