import static java.lang.Math.*;

public class MathEx02 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println(i);
        System.out.println(-i);

        try {
            System.out.println(negateExact(10));
            System.out.println(negateExact(-10));
            System.out.println(negateExact(i));
        } catch (ArithmeticException e) {
            System.out.println(negateExact((long)i));
        }
    }
}
