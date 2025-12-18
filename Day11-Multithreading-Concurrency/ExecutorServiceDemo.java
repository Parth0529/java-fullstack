import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(() -> {
            System.out.println("Task 1 executed");
        });

        service.submit(() -> {
            System.out.println("Task 2 executed");
        });

        service.shutdown();
    }
}