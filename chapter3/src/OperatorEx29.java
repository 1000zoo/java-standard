public class OperatorEx29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = -10;

        System.out.printf(" p   = %d \t\t%s\n", p, toBinaryString(p));
        System.out.printf("~p   = %d \t\t%s\n", ~p, toBinaryString(p));
        System.out.printf("~p+1 = %d \t\t%s\n", ~p+1, toBinaryString(p));
        System.out.printf("~~p  = %d \t\t%s\n", ~~p, toBinaryString(p));
        System.out.println();
        System.out.printf("n = %d\n", n);
        System.out.printf("~(n-1) = %d\n", ~(n-1));

    }
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String temp = zero + Integer.toBinaryString(x);
        return temp.substring(temp.length() - 32);
    }
    /*
    result
     p   = 10 		00000000000000000000000000001010
    ~p   = -11 		00000000000000000000000000001010
    ~p+1 = -10 		00000000000000000000000000001010
    ~~p  = 10 		00000000000000000000000000001010

    n = -10
    ~(n-1) = 10
     */
}
