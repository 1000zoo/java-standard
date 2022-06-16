import java.util.Calendar;

public class CalendarEx08 {
    public static void main(String[] args) {
        String date1 = "202206";
        String date2 = "201207";

        int month1 = Integer.parseInt(date1.substring(0, 4)) * 12 +
                Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0, 4)) * 12 +
                Integer.parseInt(date2.substring(4));
        System.out.println(month1 - month2);
    }
}
