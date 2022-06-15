import java.util.Calendar;

public class CalendarEx04 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2015, 7, 31);

        System.out.println(CalendarEx02.toString(date));
        System.out.println("1 DAY LATER");
        date.add(Calendar.DATE, 1);
        System.out.println(CalendarEx02.toString(date));

        System.out.println("6 MONTH BEFORE");
        date.add(Calendar.MONTH, -6);
        System.out.println(CalendarEx02.toString(date));

        System.out.println("31 DAY AFTER");
        date.roll(Calendar.DATE, 31);
        System.out.println(CalendarEx02.toString(date));

        System.out.println("31 DAY AFTER");
        date.add(Calendar.DATE, 31);
        System.out.println(CalendarEx02.toString(date));
    }
}
