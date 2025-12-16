public class MethodCallStackDemo {

    static void first() {
        second();
        System.out.println("First method");
    }

    static void second() {
        third();
        System.out.println("Second method");
    }

    static void third() {
        System.out.println("Third method");
    }

    public static void main(String[] args) {
        first();
    }
}
