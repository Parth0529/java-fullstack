import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int index = Arrays.binarySearch(arr, target);
        System.out.println("Found at index: " + index);
    }
}
