public class StringBasicsDemo {
    public static void main(String[] args) {

        String s1 = "Parth";
        String s2 = "Parth"; // same memory
        String s3 = new String("Parth"); // new memory

        System.out.println("s1 == s2 : " + (s1 == s2)); // true
        System.out.println("s1 == s3 : " + (s1 == s3)); // false
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true

        // Immutability demo
        String name = "Java";
        name.concat(" Programming"); // ignored
        System.out.println("After concat: " + name);

        name = name.concat(" Programming");
        System.out.println("After reassigning: " + name);
    }
}
