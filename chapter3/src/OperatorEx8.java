public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;
        long c = a * b; //(long) 생략 가능, 값은 int  (overflow)
        System.out.println(c);
    }
    /*
    result
    -1454759936
     */
}
