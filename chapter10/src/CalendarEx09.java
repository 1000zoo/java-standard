public class CalendarEx09 {
    public static void main(String[] args) {
        System.out.println("2022. 6. 12 : " + getDayOfWeek(2022, 6, 12));
        System.out.println("2020. 4. 22 : " + getDayOfWeek(2020, 4, 22));
        System.out.println(dayDiff(2014, 5, 1, 2022, 5, 2));
        System.out.println(convertDateToDay(2022, 6, 3));
        System.out.println(convertDateToDay(738223));
    }

    public static int[] endOfMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
        return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
    }

    public static int getDayOfWeek(int year, int month, int day) {
        return convertDateToDay(year, month, day) % 7 + 1;
    }

    public static String convertDateToDay(int day) {
        int year = 1;
        int month = 0;

        while (true) {
            int aYear = isLeapYear(year) ? 366 : 365;
            if (day > aYear) {
                day -= aYear;
                year++;
            } else {
                break;
            }
        }

        while (true) {
            int endDay = endOfMonth[month];
            if (isLeapYear(year) && month == 1) {
                endDay++;
            }
            if (day > endDay) {
                day -= endDay;
                month++;
            } else {
                break;
            }
        }
        return year + "-" + (month + 1) + "-" + day;
    }

    public static int convertDateToDay(int year, int month, int day) {
        int numOfLeapYear = 0;

        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                numOfLeapYear++;
            }
        }

        int toLastYearDaySum = (year - 1) * 365 + numOfLeapYear;
        int thisYearDaySum = 0;

        for (int i = 0; i < month - 1; i++) {
            thisYearDaySum += endOfMonth[i];
        }

        if (month > 2 && isLeapYear(year)) {
            thisYearDaySum++;
        }

        thisYearDaySum += day;

        return toLastYearDaySum + thisYearDaySum;
    }
}