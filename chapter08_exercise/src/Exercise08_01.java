import java.util.*;

public class Exercise08_01 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        while (true) {
            count++;
            System.out.print("1~100 => ");
            try {
                input = new Scanner(System.in).nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("input must be num");
                continue;
            }

            if (answer > input) {
                System.out.println("up");
            } else if (answer < input) {
                System.out.println("down");
            } else {
                System.out.println("CORRECT!");
                System.out.println("count: " + count);
                break;
            }
        }
    }
}
