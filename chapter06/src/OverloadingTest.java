public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) => " + mm.add(3, 3));
        System.out.println("mm.add(3L, 3) => " + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) => " + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) => " + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) => " + mm.add(a));
    }
}

class MyMath3 {
    int add (int a, int b) {
        System.out.println("int add (int a, int b) ");
        return a + b;
    }
    long add (int a, long b) {
        System.out.println("long add (int a, long b) ");
        return a + b;
    }
    long add (long a, int b) {
        System.out.println("long add (int a, long b) ");
        return a + b;
    }
    long add (long a, long b) {
        System.out.println("long add (int a, long b) ");
        return a + b;
    }
    int add (int[] a) {
        System.out.println("int add (int[] a) ");
        int result = 0;
        for (int j : a) {
            result += j;
        }
        return result;
    }
}
