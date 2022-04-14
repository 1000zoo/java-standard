import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;
        answer = (int) (Math. random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1 ~ 100 >");
            input = scanner.nextInt();

            if(input < answer) {
                System.out.println("input < answer");
            } else if(input > answer) {
                System.out.println("input > answer");
            }
        } while(input != answer);
        System.out.println("correct!");
    }
    /* result:
    1 ~ 100 >50
    input < answer
    1 ~ 100 >75
    input < answer
    1 ~ 100 >80
    input < answer
    1 ~ 100 >90
    input > answer
    1 ~ 100 >85
    input < answer
    1 ~ 100 >86
    correct!
     */
}
