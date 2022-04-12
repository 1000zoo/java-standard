import java.util.Scanner;

public class FlowEx07 {
    public static void main(String[] args) {
        System.out.print("Rock(1) scissor(2) paper(3) >> ");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random() * 3) + 1;

        System.out.println("user: " + user);
        System.out.println("com: " + com);

        switch (user - com) {
            case -1, 2 -> System.out.println("You win!");
            case 1, -2 -> System.out.println("You lose!");
            case 0 -> System.out.println("Draw");
            default -> System.out.println("???????????????");
            /**
             case 1: case -2:
             System.out.println("You win!");
             break;
             case -1: case 2:
             System.out.println("You lose!");
             break;
             case 0:
             System.out.println("Draw");
             break;
             default:
             System.out.println("???????????????");
             break;
             **/
        }
        /*
        Rock(1) scissor(2) paper(3) >> 2
        user: 2
        com: 1
        You lose!
         */
    }
}
