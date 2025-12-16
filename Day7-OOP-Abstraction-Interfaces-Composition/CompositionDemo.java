class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine = new Engine(); // composition

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
