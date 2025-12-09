public class ThrowThrowsDemo {

    public static void validate(int marks) throws Exception {
        if (marks < 0) {
            throw new Exception("Marks cannot be negative!");
        }
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            validate(-10);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
