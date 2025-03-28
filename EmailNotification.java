// EmailNotification concrete class
public class EmailNotification implements INotification {
    EmailNotification() {
        
    }
    
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL with message: " + message);
    }
}