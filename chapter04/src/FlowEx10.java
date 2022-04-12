import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        char grade = ' ';
        System.out.print("score >> ");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        switch(score / 10) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Your grade is " + grade);
        /*
        result :
        score >> 99
        Your grade is A
         */
    }
}
