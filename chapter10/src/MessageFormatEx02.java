import java.text.*;

public class MessageFormatEx02 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'')";

        Object[][] arguments = {
                {"Jiwoo", "010-1234-1234", "17", "xx-xx"},
                {"LLII", "010-4312-1544", "21", "12-22"}
        };

        for (int i = 0; i < arguments.length; i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
