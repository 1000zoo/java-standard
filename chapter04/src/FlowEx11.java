import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.print("regNo (011231-1111222) >> ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch(gender) {
            case '1': case '3':
                switch(gender) {
                    case '1':
                        System.out.println("Before 2000, Male");
                        break;
                    case '3':
                        System.out.println("After 2000, Male");
                        break;
                }
                break;          //주의
            case '2': case '4':
                switch(gender) {
                    case '2':
                        System.out.println("Before 2000, Female");
                        break;
                    case '4':
                        System.out.println("After 2000, Female");
                        break;
                }
                break;
            default:
                System.out.println("???????");
        }
    }
    /*
    result :
    regNo (011231-1111222) >> 971234-1111111
    Before 2000, Male
     */
}
