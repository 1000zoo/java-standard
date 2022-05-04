public class CallStackTest02 {
    public static void main(String[] args) {
        System.out.println("main(String[] args) started");
        firstMethod();
        System.out.println("main(String[] args) end");
    }
    static void firstMethod() {
        System.out.println("firstMethod() started");
        secondMethod();
        System.out.println("firstMethod() end");
    }
    static void secondMethod() {
        System.out.println("secondMethod() started");
        System.out.println("secondMethod() end");
    }
}
