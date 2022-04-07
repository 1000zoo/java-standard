public class CastingEx3 {
    public static void main(String[] args) {
        float f1 = 9.1234567f;
        double d1 = 9.1234567;
        double d2 = (double)f1;
        double d3 = 3.123151235123;
        float f2 = (float)d3;

        System.out.printf("f1 = %20.18f%n", f1);
        System.out.printf("d1 = %20.18f%n", d1);
        System.out.printf("d2 = %20.18f%n", d2);
        System.out.printf("d3 = %20.18f%n", d3);
        System.out.printf("f2 = %20.18f%n", f2);
    }
    /*
    result
    """
    f1 = 9.123456954956055000
    d1 = 9.123456700000000000
    d2 = 9.123456954956055000
    d3 = 3.123151235123000000
    f2 = 3.123151302337646500
    """
     */
}
