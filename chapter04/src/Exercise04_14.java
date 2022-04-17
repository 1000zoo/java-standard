import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise04_14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            count++;
            System.out.print("1 ~ 100 >> ");
            input = scanner.nextInt();

            if(answer > input) {
                System.out.println("over");
            } else if(answer < input) {
                System.out.println("under");
            } else {
                System.out.println("answer!");
                System.out.println("count: " + count);
                break;
            }
        } while(true);
    }
    /*
    result:
    1 ~ 100 >> 50
    under
    1 ~ 100 >> 25
    under
    1 ~ 100 >> 12
    under
    1 ~ 100 >> 6
    over
    1 ~ 100 >> 9
    over
    1 ~ 100 >> 10
    answer!
    count: 6
     */
}
