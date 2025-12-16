interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Card");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        Payment p2 = new CardPayment();

        p1.pay(500);
        p2.pay(1200);
    }
}
