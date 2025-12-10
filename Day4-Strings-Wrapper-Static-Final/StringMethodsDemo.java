public class StringMethodsDemo {
    public static void main(String[] args) {
        String s = "  Hello Java Developer  ";

        System.out.println("Length: " + s.length());
        System.out.println("Trim: '" + s.trim() + "'");
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("Contains 'Java': " + s.contains("Java"));
        System.out.println("Starts with 'He': " + s.trim().startsWith("He"));
        System.out.println("Substring: " + s.substring(2, 7));
    }
}
