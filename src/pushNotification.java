public class pushNotification implements NotificationService {
     String deviceID;
     public pushNotification(String deviceID) {
         this.deviceID = deviceID;
     }
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification to device " + deviceID + ": " + message);
    }
    @Override
    public void setDefaultPriority(String priority) {
         System.out.println("Default Priority set to " + priority);
    }


}
    class EmailNotification implements NotificationService {

        public void sendNotification() {
            System.out.println("Sending Email Notification: " );
        }
        @Override
        public void sendNotification(String message) {
            System.out.println("Sending Email Notification: " + message );
        }
    }
    class SMSNotification implements NotificationService {

        public void sendNotification() {
            System.out.println("Sending SMS Notification: " );
        }
        @Override
        public void sendNotification(String message) {
            System.out.println("Sending SMS Notification: " + message );
        }
}
