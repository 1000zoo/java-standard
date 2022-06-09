import java.util.*;

public class RandomEx03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(getRand(5,10) + ",");
        }
        System.out.println();

        int[] result = fillRand(new int[10], new int[] {2, 4, 6, 7});
        System.out.println(Arrays.toString(result));
    }

    public static int[] fillRand(int[] arr, int[] data) {
        Arrays.fill(arr, data[getRand(0, data.length - 1)]);
        return arr;
    }

    public static int getRand(int from, int to) {
        return (int) (Math.random() * Math.abs(to - from) + 1);
    }
}
