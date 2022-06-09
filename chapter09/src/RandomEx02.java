import java.util.Arrays;
import java.util.Random;

public class RandomEx02 {
    public static void main(String[] args) {
        Random rand = new Random(1);
        int[] number = new int[100];
        int[] counter = new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] = rand.nextInt(10));
        }
        System.out.println();

        for (int j : number) {
            counter[j]++;
        }
        for (int j : counter) {
            System.out.println("i:" + printGraph('#', j) + " " + j);
        }
    }

    public static String printGraph(char ch, int value) {
        char[] bar = new char[value];

        Arrays.fill(bar, ch);
        return new String(bar);
    }
}
