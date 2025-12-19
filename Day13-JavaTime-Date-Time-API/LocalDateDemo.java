import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate custom = LocalDate.of(2025, 1, 15);

        System.out.println("Today: " + today);
        System.out.println("Custom date: " + custom);
        System.out.println("Day of month: " + today.getDayOfMonth());
        System.out.println("Day of week: " + today.getDayOfWeek());
    }
}
