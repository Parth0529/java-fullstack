import java.util.Arrays;
import java.util.List;

public class ForEachLambdaDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Parth", "Rohit", "Sneha");

        names.forEach(name -> System.out.println(name));
    }
}
