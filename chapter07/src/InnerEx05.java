class OuterX {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println("value : " + value);
            System.out.println("this.value : " + this.value);
            System.out.println("OuterX.this.value :" + OuterX.this.value);
        }
    }
}

public class InnerEx05 {
    public static void main(String[] args) {
        OuterX outer = new OuterX();
        OuterX.Inner inner = outer.new Inner();
        inner.method1();
    }
}
