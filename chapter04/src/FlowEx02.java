import java.util.*;

public class FlowEx02 {
    public static void main(String[] args) {
        int input;
        System.out.print(">>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if(input == 0) {
            System.out.println("Input is 0");
        }
        if(input != 0) {
            System.out.println("Input is not 0");
            System.out.printf("Input is %d\n", input);
        }
    }
    /*
    input >> 9
    result :
    Input is not 0
    Input is 9
     */
}
