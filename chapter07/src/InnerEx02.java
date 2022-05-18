public class InnerEx02 {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // InstanceInner obj1 = new InstanceInner(); <= error / static member 는 instance member 에 접근 불가
        StaticInner obj2 = new StaticInner();

        // InstanceInner obj1 = new InstanceInner(); ==
        InnerEx02 outer = new InnerEx02();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // LocalInner lv = new LocalInner(); <= error!
    }
    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
