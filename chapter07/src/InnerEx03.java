public class InnerEx03 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int ilv = outerIv;
        int ilv2 = outerCv;
    }

    static class StaticInner {
        // static class 는 외부 클래스의 instance member 에 접근 불가
        // int siv = outerIv;
        static int scv = outerCv;
    }
    void myMethod() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // 외부의 지역변수는 자동으로 final 처리
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
