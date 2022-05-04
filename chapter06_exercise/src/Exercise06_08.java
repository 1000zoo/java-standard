public class Exercise06_08 {
    public static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(isNumber(str));
        str = "123adf12";
        System.out.println(isNumber(str));
    }
}
