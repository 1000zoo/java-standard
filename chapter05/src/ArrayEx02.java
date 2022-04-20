import java.util.Arrays;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[] {100, 95, 80, 70, 30};
        char[] chArr = new char[] {'a', 'b', 'c'};

        for(int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        for(int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random() * 10) + 1;
        }
        for(int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ", ");
        }
        System.out.println();
        for(int tmp : iArr3) {
            System.out.print(tmp + ", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
    /*
    result:
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
    100, 95, 80, 70, 30,
    [3, 4, 2, 3, 5, 2, 7, 9, 7, 4]
    [100, 95, 80, 70, 30]
    [a, b, c]
    [I@28a418fc
    abc
     */
}
