// PushNotification concrete class
public class PushNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification with message: " + message);
    }
}