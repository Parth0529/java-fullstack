import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Sorted numbers: " + numbers);

        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
    }
}
