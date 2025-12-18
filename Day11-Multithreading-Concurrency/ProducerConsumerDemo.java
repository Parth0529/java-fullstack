class Store {
    int item;
    boolean available = false;

    synchronized void produce(int item) throws InterruptedException {
        while (available) wait();
        this.item = item;
        available = true;
        System.out.println("Produced: " + item);
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) wait();
        System.out.println("Consumed: " + item);
        available = false;
        notify();
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {

        Store store = new Store();

        new Thread(() -> {
            try {
                store.produce(100);
            } catch (InterruptedException e) {}
        }).start();

        new Thread(() -> {
            try {
                store.consume();
            } catch (InterruptedException e) {}
        }).start();
    }
}