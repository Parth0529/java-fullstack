import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("India time: " + india);
        System.out.println("USA time: " + usa);
    }
}
