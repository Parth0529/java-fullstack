import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Parth", 90);
        marks.put("Rohit", 80);
        marks.put("Sneha", 95);

        System.out.println("Student marks: " + marks);

        System.out.println("Parth's marks: " + marks.get("Parth"));

        marks.remove("Rohit");
        System.out.println("After removing Rohit: " + marks);
    }
}
