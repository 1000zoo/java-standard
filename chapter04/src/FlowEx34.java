import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args){
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        outer:
        while(true) {
            System.out.println("{1} square");
            System.out.println("{2} square root");
            System.out.println("{3} log");
            System.out.print(">> (0 for exit)");

            menu = scanner.nextInt();

            if(menu == 0) {
                System.out.println("EXIT");
                break;
            } else if(!(1 <= menu && 3 >= menu)){
                System.out.println("Wrong");
                continue;
            }
            for(;;) {
                System.out.print("a (cal exit:0, exit:99)>> ");
                num = scanner.nextInt();

                if(num == 0) {
                    break;
                }
                if(num == 99) {
                    break outer;
                }
                switch(menu) {
                    case 1:
                        System.out.println("result = " + num*num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                }
            }
        }

    }
    /* result:
    {1} square
    {2} square root
    {3} log
    >> (0 for exit)2
    a (cal exit:0, exit:99)>> 4
    result = 2.0
    a (cal exit:0, exit:99)>> 6
    result = 2.449489742783178
    a (cal exit:0, exit:99)>> 0
    {1} square
    {2} square root
    {3} log
    >> (0 for exit)3
    a (cal exit:0, exit:99)>> 6
    result = 1.791759469228055
    a (cal exit:0, exit:99)>> 99
     */
}
