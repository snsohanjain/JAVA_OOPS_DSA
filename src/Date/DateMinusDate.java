package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateMinusDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate someDate = LocalDate.of(2000, Month.MARCH,6);
        System.out.println(someDate.plus( 23, ChronoUnit.YEARS));

        System.out.println(someDate.getDayOfMonth());
        System.out.println(someDate.getDayOfWeek());
        System.out.println(someDate.getYear());
        System.out.println(localDateTime);
    }
}
