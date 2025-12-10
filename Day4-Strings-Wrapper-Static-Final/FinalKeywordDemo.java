final class Car {
    final int speedLimit = 120;

    final void showLimit() {
        System.out.println("Speed limit: " + speedLimit);
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.showLimit();
    }
}
