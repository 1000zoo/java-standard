public class ExceptionEx02 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10);
            System.out.println(result);
        }
        // (int) (Math.random() * 10) 의 결과가 0 일경우
        // ArithmeticException 발생
    }
}
