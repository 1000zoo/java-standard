public class Exercise06_09 {
    final static int MIN = -999999;
    public static int myMax(int[] arr) {
        if (arr == null || arr.length == 0) return MIN;
        int max = MIN;
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(myMax(data));
        System.out.println(myMax(null));
        System.out.println(myMax(new int[] {}));
    }
}
