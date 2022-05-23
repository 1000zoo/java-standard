public class ExceptionEx01 {
    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
            try {} catch (Exception e1) {} // 같은 예외처리문 내부에서 exception 이 중복 선언되면 안된다.
        }

        try {

        } catch (Exception e) {

        }
    }
}
