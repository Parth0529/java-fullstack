abstract class Animal {
    abstract void sound();
}

interface Flyable {
    void fly();
}

class Bird extends Animal implements Flyable {
    public void sound() {
        System.out.println("Bird chirps");
    }

    public void fly() {
        System.out.println("Bird flies in sky");
    }
}

public class AbstractVsInterfaceDemo {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sound();
        b.fly();
    }
}
