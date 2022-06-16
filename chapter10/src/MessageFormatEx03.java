import java.text.MessageFormat;

public class MessageFormatEx03 {
    public static void main(String[] args) throws Exception {
        String[] data = {
                "INSERT INTO CUS_INFO VALUES ('Jiwoo', '010-1234-1234', '17', 'xx-xx')",
                "INSERT INTO CUS_INFO VALUES ('LLII', '010-4312-1544', '21', '12-22')"
        };

        String pattern = "INSERT INTO CUS_INFO VALUES ({0}, {1}, {2}, {3})";
        MessageFormat mf = new MessageFormat(pattern);

        for (int i = 0; i < data.length; i++) {
            Object[] obj = mf.parse(data[i]);
            for (int j = 0; j < obj.length; j++) {
                System.out.println(obj[j] + ",");
            }
            System.out.println();
        }
    }
}
