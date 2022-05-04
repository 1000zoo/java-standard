public class Exercise06_10 {
    public static int myAbs(int value) {
        return value >= 0 ? value : -value;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(myAbs(value));
        value = -5;
        System.out.println(myAbs(value));
    }
}
