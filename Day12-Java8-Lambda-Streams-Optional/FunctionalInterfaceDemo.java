@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator mul = (a, b) -> a * b;

        System.out.println("Add: " + add.operate(10, 20));
        System.out.println("Multiply: " + mul.operate(5, 4));
    }
}
