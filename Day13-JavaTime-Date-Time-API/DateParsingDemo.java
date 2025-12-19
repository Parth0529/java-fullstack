import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsingDemo {
    public static void main(String[] args) {
        String dateStr = "25-12-2025";

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateStr, fmt);

        System.out.println("Parsed date: " + date);
    }
}
