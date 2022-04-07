public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
//      char c2 = c1 + 1;     => error, rvalue type == int
        char c2 = 'a' + 1;
        System.out.println(c2);
    }
    //result: b
}
