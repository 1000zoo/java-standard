public class OperatorEx09 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;
        System.out.println("a=" + a + ", b="+ b);
    }
    /*
    result
    a=-727379968, b=1000000000000
     */
}
