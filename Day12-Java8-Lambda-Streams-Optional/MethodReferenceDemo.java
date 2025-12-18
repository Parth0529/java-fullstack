import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Spring", "Boot");

        names.forEach(System.out::println);
    }
}
