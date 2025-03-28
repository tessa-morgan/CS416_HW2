public class SMSNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}