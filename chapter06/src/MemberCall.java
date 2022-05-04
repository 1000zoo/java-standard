class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv; => error! 클래스 변수는 인스턴스 변수를 사용할 수  없다.
    static int cv2 = new MemberCall().iv;

    static void staticMethod() {
        System.out.println(cv);
//        System.out.println(iv); => error! 클래스메소드에서 인스턴스 변수를 사용할 수 없다.
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }
    void instanceMethod() {
        System.out.println(cv);
        System.out.println(iv);
    }
    static void staticMethod_() {
        staticMethod();
//        instanceMethod(); => error! 클래스 메소드에서는 인스턴스 메소드를 호출할 수 없다.
        MemberCall c = new MemberCall();
        c.instanceMethod();
    }
    void instanceMethod_() {
        staticMethod();
        instanceMethod();
    }
}
