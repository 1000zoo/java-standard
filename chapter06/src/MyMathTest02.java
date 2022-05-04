class MyMath02 {
    long a, b;

    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a / b; }

    static long add (long a, long b) { return a + b; }
    static long subtract (long a, long b) { return a - b; }
    static long multiply (long a, long b) { return a * b; }
    static double divide (long a, long b) { return a / b; }
}

public class MyMathTest02 {
    public static void main(String[] args) {
        System.out.println(MyMath02.add(200L, 100L));
        System.out.println(MyMath02.subtract(200L, 100L));
        System.out.println(MyMath02.multiply(200L, 100L));
        System.out.println(MyMath02.divide(200L, 100L));

        MyMath02 mm = new MyMath02();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}