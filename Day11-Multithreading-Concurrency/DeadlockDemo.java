class Resource {}

public class DeadlockDemo {

    static Resource r1 = new Resource();
    static Resource r2 = new Resource();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread 1 locked r1");
                synchronized (r2) {
                    System.out.println("Thread 1 locked r2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread 2 locked r2");
                synchronized (r1) {
                    System.out.println("Thread 2 locked r1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}