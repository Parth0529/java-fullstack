class Worker extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Worker finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadSleepJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Worker w = new Worker();
        w.start();
        w.join(); // wait for worker
        System.out.println("Main thread finished");
    }
}