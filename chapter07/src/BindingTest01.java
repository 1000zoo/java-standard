public class BindingTest01 {
    public static void main(String[] args) {
        Super sup = new Sub();
        Sub sub = new Sub();

        System.out.println("sup.x = " + sup.x);
        sup.method();

        System.out.println("sub.x = " + sub.x);
        sub.method();
    }
}

class Super {
    int x = 100;

    void method() {
        System.out.println("Super Method");
    }
}

class Sub extends Super {
    int x = 200;

    void method() {
        System.out.println("Sub Method");
    }
}
