import java.util.Scanner;

public class FlowEx09 {
    public static void main(String[] args) {
        char grade = ' ';
        System.out.print("score >> ");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        switch(score) {
            case 100, 99, 98, 97 ,96, 95, 94, 93, 92, 91, 90
                -> grade = 'A';
            case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80
                -> grade = 'B';
            case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70
                -> grade = 'C';
            default -> grade = 'F';
            /**
             * case 100: case 99: ...
             * grade = ...
             * break;
             * case 89: case 88: ...
             * ...
             * break;
             * ...
             *
             */
        }
        System.out.println("Your grade is " + grade);
        /*
        result :
        score >> 99
        Your grade is A
         */
    }
}
