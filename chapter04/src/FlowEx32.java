import java.util.*;

public class FlowEx32 {
    public static void main(String[] args){

        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("{1} square");
            System.out.println("{2} square root");
            System.out.println("{3} log");
            System.out.print(">> (0 for exit)");

            menu = scanner.nextInt();

            if(menu == 0) {
                System.out.println("EXIT");
                break;
            } else if(!(1 <= menu && menu <= 3)){
                System.out.println("Wrong Input");
                continue;
            }
            System.out.println(menu);
        }
    }
    /* result:
    >> (0 for exit)3
    3
    {1} square
    {2} square root
    {3} log
    >> (0 for exit)0
    EXIT
     */
}
