import java.util.Arrays;
import java.util.List;

public class StreamBasicsDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);

        nums.stream()
            .filter(n -> n > 20)
            .map(n -> n * 2)
            .forEach(System.out::println);
    }
}
