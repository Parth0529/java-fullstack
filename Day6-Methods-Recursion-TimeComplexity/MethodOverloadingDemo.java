public class MethodOverloadingDemo {

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 4));
        System.out.println(multiply(2.5, 4.0));
    }
}
