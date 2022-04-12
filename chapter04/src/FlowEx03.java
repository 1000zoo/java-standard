import java.util.*;

public class FlowEx03 {
    public static void main(String[] args) {
        System.out.print(">> ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 0) {
            System.out.println("Input is 0");
        } else {
            System.out.println("Input is not 0");
        }
    }
    /*
    input >> 44
    result :
    Input is not 0
     */
}
