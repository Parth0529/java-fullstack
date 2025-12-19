import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime custom = LocalTime.of(10, 30, 45);

        System.out.println("Now: " + now);
        System.out.println("Custom time: " + custom);
        System.out.println("Hour: " + now.getHour());
    }
}
