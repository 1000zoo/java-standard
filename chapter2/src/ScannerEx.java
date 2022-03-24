import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print(">");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("=> " + input);
        System.out.printf("num=%d%n", num);
    }
}
