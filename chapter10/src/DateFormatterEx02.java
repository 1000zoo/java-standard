import java.time.*;
import java.time.format.*;

public class DateFormatterEx02 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.parse("2022-02-03", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate date = LocalDate.parse("2021-07-06");
        LocalTime time = LocalTime.parse("12:34:56");
        LocalDateTime dateTime = LocalDateTime.parse("2020-11-20T23:59:59");

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime endOfYear = LocalDateTime.parse("2021-11-03 23:59:59", pattern);

        System.out.println(newYear);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(endOfYear);
    }
}
