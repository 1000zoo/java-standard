public class OperatorEx03 {
    public static void main(String[] args) {
        int i = 5, j = 5;
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i = " + i + ", j = " + j);

        int x = 5;
        System.out.println(x++ - ++x);
    }
    /*
    result
    5
    6
    i = 6, j = 6
    -2
     */
}
