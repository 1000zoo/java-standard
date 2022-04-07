import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.print(">");
        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9') {
            System.out.println("숫자");
        }
        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("영어");
        }
    }
    /*
    input
    7
    H
    result
    숫자
    영어
     */
}
