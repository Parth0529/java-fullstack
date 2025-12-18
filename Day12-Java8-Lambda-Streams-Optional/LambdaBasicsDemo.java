interface Greeting {
    void sayHello();
}

public class LambdaBasicsDemo {
    public static void main(String[] args) {

        // Old way (anonymous class)
        Greeting g1 = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from old style");
            }
        };

        // Lambda way
        Greeting g2 = () -> System.out.println("Hello from lambda");

        g1.sayHello();
        g2.sayHello();
    }
}
