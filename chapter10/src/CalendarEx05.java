import java.util.Calendar;

public class CalendarEx05 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2015, 0, 31);
        System.out.println(CalendarEx02.toString(date));
        date.roll(Calendar.MONTH, 1);
        System.out.println(CalendarEx02.toString(date));
    }
}
