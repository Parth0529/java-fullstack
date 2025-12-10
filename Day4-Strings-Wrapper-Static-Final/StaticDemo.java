public class StaticDemo {

    static int count = 0; // static variable

    static {
        System.out.println("Static block executed once.");
    }

    public StaticDemo() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
        new StaticDemo();

        System.out.println("Total objects created: " + StaticDemo.getCount());
    }
}
