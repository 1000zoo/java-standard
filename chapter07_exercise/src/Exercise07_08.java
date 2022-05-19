class Outer {
    int value = 10;
    class Inner {
        int iv = 100;
        int value = 20;

        void method1() {
            int value = 30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);
        }
    }
    static class SInner {
        int iv = 200;
    }
}

public class Exercise07_08 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();
        System.out.println(oi.iv);

        Outer.SInner s = new Outer.SInner();
        System.out.println(s.iv);

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method1();
    }
}
