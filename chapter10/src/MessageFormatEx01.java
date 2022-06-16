import java.text.*;

public class MessageFormatEx01 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1}\nAge: {2}\nBirthday: {3}";

        Object[] arguments = {
                "Jiwoo", "010-1234-1234", "17", "xx-xx"
        };

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
