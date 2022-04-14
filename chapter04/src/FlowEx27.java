import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(">> (stop to 0) ");

        while(flag) {
            System.out.print(">>");
            num = scanner.nextInt();
            if(num != 0) {
                sum += num;
            } else {
                flag = false;
                //break;
            }
        }
        System.out.println(sum);
    }
    /* result:
    >> (stop to 0)
    >>100
    >>200
    >>300
    >>400
    >>0
    1000
     */
}
