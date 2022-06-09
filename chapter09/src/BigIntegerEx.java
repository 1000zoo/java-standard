import java.math.*;

public class BigIntegerEx {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d!=%s\n", i, calcFactorial(i));
            Thread.sleep(300);
        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger bigInteger) {
        if (bigInteger.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return bigInteger.multiply(factorial(bigInteger.subtract(BigInteger.ONE)));
        }
    }
}
