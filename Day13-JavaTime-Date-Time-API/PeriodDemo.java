import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.now();

        Period p = Period.between(start, end);
        System.out.println("Years: " + p.getYears());
        System.out.println("Months: " + p.getMonths());
        System.out.println("Days: " + p.getDays());
    }
}
