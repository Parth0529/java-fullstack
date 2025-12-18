import java.util.Arrays;
import java.util.List;

public class StreamOperationsDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5, 2, 9, 1, 7);

        nums.stream()
            .sorted()
            .forEach(System.out::println);

        long count = nums.stream()
                         .filter(n -> n > 5)
                         .count();

        int sum = nums.stream()
                      .reduce(0, Integer::sum);

        System.out.println("Count > 5: " + count);
        System.out.println("Sum: " + sum);
    }
}
