import java.util.Scanner;

public class FlowEx04 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("score >> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if(score >= 90) {
            grade = 'A';
        } else if(score >= 80) {
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Your grade is " + grade + ".");
    }
    /*
    input >> 99
    result :
    Your grade is A.

     */
}
