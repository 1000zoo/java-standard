public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b1 = (byte)i;
        int j = 300;
        byte b2 = (byte)j;

        System.out.printf("[int -> byte] i = %d -> b1 = %d%n", i, b1);
        System.out.printf("[int -> byte] j = %d -> b2 = %d%n", j, b2);
    }
    /*
    result
    """
    [int -> byte] i = 10 -> b1 =  10
    [int -> byte] j = 300 -> b2 = 44
    """
     */
}
