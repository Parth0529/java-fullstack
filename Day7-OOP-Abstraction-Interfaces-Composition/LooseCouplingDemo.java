interface MessageService {
    void sendMessage(String msg);
}

class EmailService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("Email sent: " + msg);
    }
}

class SmsService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("SMS sent: " + msg);
    }
}

class Notification {
    private MessageService service;

    Notification(MessageService service) {
        this.service = service;
    }

    void notifyUser(String msg) {
        service.sendMessage(msg);
    }
}

public class LooseCouplingDemo {
    public static void main(String[] args) {
        Notification n1 = new Notification(new EmailService());
        Notification n2 = new Notification(new SmsService());

        n1.notifyUser("Welcome Parth");
        n2.notifyUser("OTP is 1234");
    }
}
