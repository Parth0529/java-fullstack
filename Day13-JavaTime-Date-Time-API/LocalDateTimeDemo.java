import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date-time: " + now);

        System.out.println("Plus 5 days: " + now.plusDays(5));
        System.out.println("Minus 2 hours: " + now.minusHours(2));
    }
}
