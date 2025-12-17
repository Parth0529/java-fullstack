public class MemoryStackHeapDemo {

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }

    static void changeName(Person p) {
        p.name = "Changed Name";
    }

    public static void main(String[] args) {
        int x = 10; // stored in stack
        Person p1 = new Person("Parth"); // object in heap, reference in stack

        System.out.println("Before: " + p1.name);
        changeName(p1);
        System.out.println("After: " + p1.name);
    }
}
