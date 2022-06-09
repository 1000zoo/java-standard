import static java.lang.Math.*;

public class MathEx01 {
    public static void main(String[] args) {
        double val = 90.123;
        System.out.println(val + "," + round(val));
        val *= 100;

        System.out.println(val + "," + round(val));

        System.out.println(round(val)/100);
        System.out.println(round(val)/100.0);
        System.out.println();

        System.out.println(1.1 + "," + ceil(1.1));
        System.out.println(1.5 + "," + floor(1.5));
        System.out.println(1.1 + "," + round(1.1));
        System.out.println(1.5 + "," + round(1.5));
        System.out.println(1.5 + "," + rint(1.5));
        System.out.println(-1.5 + "," + round(-1.5));
        System.out.println(-1.5 + "," + rint(-1.5));
        System.out.println(-1.5 + "," + ceil(-1.5));
        System.out.println(-1.5 + "," + floor(-1.5));
    }
}
