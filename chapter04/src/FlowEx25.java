import java.util.*;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("num > ");
        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);    // String => int

        while(num != 0) {
            sum += num % 10;
            System.out.printf("sum = %2d num = %d\n", sum, num);
            num /= 10;
        }
        System.out.println(sum);
    }
    /* result:
    num > 12345
    sum =  5 num = 12345
    sum =  9 num = 1234
    sum = 12 num = 123
    sum = 14 num = 12
    sum = 15 num = 1
    15
     */
}
