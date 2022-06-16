import java.time.*;
import java.time.temporal.*;

public class NewTimeEx04 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 11, 3);
        LocalDate date2 = LocalDate.of(2012, 11, 12);

        Period pe = Period.between(date1, date2);
        System.out.println(date1);
        System.out.println(date2);

        System.out.println(pe.get(ChronoUnit.YEARS));
        System.out.println(pe.get(ChronoUnit.MONTHS));
        System.out.println(pe.get(ChronoUnit.DAYS));

        LocalTime time1 = LocalTime.of(0, 0, 0);
        LocalTime time2 = LocalTime.of(12, 34, 56);

        Duration du = Duration.between(time1, time2);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(du);

        LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());

        System.out.println(tmpTime.getHour());
        System.out.println(tmpTime.getMinute());
        System.out.println(tmpTime.getSecond());
        System.out.println(tmpTime.getNano());

    }
}
