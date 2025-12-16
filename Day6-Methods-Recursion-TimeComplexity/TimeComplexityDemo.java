public class TimeComplexityDemo {

    static void printOnce(int n) {
        System.out.println("O(1)");
    }

    static void printN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" -> O(n)");
    }

    static void printNN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("O(n^2)");
    }

    public static void main(String[] args) {
        printOnce(5);
        printN(5);
        printNN(3);
    }
}
