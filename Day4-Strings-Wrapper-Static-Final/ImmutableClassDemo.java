final class Student {

    private final String name;
    private final int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() { return name; }
    public int getRoll() { return roll; }
}

public class ImmutableClassDemo {
    public static void main(String[] args) {
        Student s = new Student("Parth", 101);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll: " + s.getRoll());
    }
}
