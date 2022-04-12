import java.util.Scanner;

public class FlowEx05 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("score >> ");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("Your score is %d.\n", score);

        if(score >= 90) {
            grade = 'A';
            if(score >= 98) {
                opt = '+';
            } else if(score < 94) {
                opt = '-';
            }
        } else if(score >= 80) {
            if(score >= 88) {
                opt = '+';
            } else if(score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.println("Your grade is " + grade + opt + ".");
    }
    /*
    input >> 99
    result :
    Your score is 99.
    Your grade is A+.
     */
}
