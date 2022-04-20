import java.util.Arrays;

public class ArrayEx09 {
    public static void main(String[] args) {
        int[] code = {-4, 1, -2, 5, 13, -12, 7};
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            int tmp = (int)(Math.random() * code.length);
            arr[i] = code[tmp];
        }
        System.out.println(Arrays.toString(arr));
    }
    /*
    result:
    ball[0] = 8
    ball[1] = 24
    ball[2] = 33
    ball[3] = 39
    ball[4] = 15
    ball[5] = 19
     */
}
