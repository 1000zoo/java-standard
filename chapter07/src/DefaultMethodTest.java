public class DefaultMethodTest {
    public static void main(String[] args) {
        ChildX c = new ChildX();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterfaceX.staticMethod();
    }
}

class ChildX extends ParentX implements MyInterface, MyInterfaceX {
    public void method1() {
        System.out.println("method() in Child");
    }
}

class ParentX {
    public void method2() {
        System.out.println("method2 in ParentX");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in myInterface");
    }
    default void method2() {
        System.out.println("method2() in myInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in myInterface");
    }
}

interface MyInterfaceX {
    default void method1() {
        System.out.println("method1() in MyInterfaceX");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterfaceX");
    }
}
