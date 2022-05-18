public class SuperTest02 {
    public static void main(String[] args) {
        Child02 c = new Child02();
        c.method();
    }
}

class Child02 extends Parent {
    int x = 20;
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
