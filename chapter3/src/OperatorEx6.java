public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
//      byte c = a + b;   =>  error! byte + byte -> int 로 처리되기 때문
        byte c = (byte)(a + b);
        System.out.println(c);
    }
    //result: 30
}
