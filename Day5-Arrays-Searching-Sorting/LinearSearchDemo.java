public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target = 45;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
