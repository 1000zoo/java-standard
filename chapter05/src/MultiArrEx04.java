import java.util.*;

public class MultiArrEx04 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s 의 뜻은 ?\n", i + 1, words[i][0]);
            System.out.print(">> ");
            String ans = scanner.nextLine();

            if (ans.equals(words[i][1])) {
                System.out.println("CORRECT!");
            } else {
                System.out.printf("WRONG / ANSWER => %s\n", words[i][1]);
            }
        }
    }
    /*
    Q1. chair 의 뜻은 ?
    >> 의자
    CORRECT!
    Q2. computer 의 뜻은 ?
    >> 콤퓨타
    WRONG / ANSWER => 컴퓨터
    Q3. integer 의 뜻은 ?
    >> 정수
    CORRECT!
     */
}
