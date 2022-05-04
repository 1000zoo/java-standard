public class Exercise06_06 {
    public static int[] shuffle(int[] arr) {
        int tmp = 0;
        int changePoint = 0;
        for (int i = 0; i < 100; i++) {
            changePoint = (int)(Math.random() * arr.length);
            tmp = arr[changePoint];
            arr[changePoint] = arr[0];
            arr[0] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9,};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
