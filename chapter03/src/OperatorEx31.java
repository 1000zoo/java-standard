public class OperatorEx31 {
    public static void main(String[] args) {
        int hex = 0XABCD;
        int mask = 0XF;

        System.out.printf("hex=%X\n", hex);
        System.out.printf("%X\n", hex & mask);

        hex = hex >> 4;
        System.out.printf("%X\n", hex & mask);

        hex = hex >> 4;
        System.out.printf("%X\n", hex & mask);

        hex >>= 4;
        System.out.printf("%X\n", hex & mask);
    }
    /*
    result
    hex=ABCD
    D
    C
    B
    A
     */
}
