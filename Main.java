public class Main {
    public static void main(String[] args) {
        // Retrieve a Notification instance for EMAIL
        INotification notification = NotificationFactory.createNotification(NotificationChannelType.EMAIL);
        
        // Use the notification instance without knowing its concrete type
        notification.send("Hello!");
    }
}