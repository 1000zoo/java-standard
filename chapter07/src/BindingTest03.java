public class BindingTest03 {
    public static void main(String[] args) {
        Super sup = new Sub__();
        Sub__ sub = new Sub__();

        System.out.println("sup.x = " + sup.x);
        sup.method();
        System.out.println();
        System.out.println("sub.x = " + sub.x);
        sub.method();
    }
}

class Sub__ extends Super {
    int x = 200;

    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}