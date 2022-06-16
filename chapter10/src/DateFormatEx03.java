import java.text.*;
import java.util.*;

public class DateFormatEx03 {
    public static void main(String[] args) {
        DateFormat df1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df1.parse("2022년 11월 22일");
            System.out.println(df2.format(d));
        } catch (Exception e) {

        }
    }
}
