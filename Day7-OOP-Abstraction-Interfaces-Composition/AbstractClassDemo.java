abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Uses fuel");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with kick/self");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuelType();
    }
}
