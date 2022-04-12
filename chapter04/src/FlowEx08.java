import java.util.Scanner;

public class FlowEx08 {
    public static void main(String[] args) {
        System.out.print("regNo (011231-1111222) >> ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch(gender) {
            case '1', '3' -> System.out.println("Male");
            case '2', '4' -> System.out.println("Female");
            default -> System.out.println("?????????????");
            /**
             * case '1': case '3':
             * print
             * break;
             * case '2': case '4'
             * print
             * break;
             * default:
             * print
             */
        }
        /*
        result :
        regNo (011231-1111222) >> 971234-1xxxxxx
        Male
         */
    }
}
