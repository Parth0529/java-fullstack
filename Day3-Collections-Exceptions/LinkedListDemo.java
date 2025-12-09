import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("Parth");
        queue.add("Rohit");
        queue.add("Sneha");

        System.out.println("Queue: " + queue);

        System.out.println("Removed: " + queue.removeFirst());
        System.out.println("After removal: " + queue);
    }
}
