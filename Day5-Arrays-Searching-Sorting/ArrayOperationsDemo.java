public class ArrayOperationsDemo {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};

        int sum = 0;
        int max = arr[0];

        for (int n : arr) {
            sum += n;
            if (n > max) max = n;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }
}
