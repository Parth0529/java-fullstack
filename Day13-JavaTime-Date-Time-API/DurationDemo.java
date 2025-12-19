import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(12, 30);

        Duration d = Duration.between(t1, t2);
        System.out.println("Minutes: " + d.toMinutes());
        System.out.println("Seconds: " + d.getSeconds());
    }
}
