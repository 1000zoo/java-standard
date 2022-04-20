import java.util.Arrays;

public class ArrayEx03 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("[변경전]");
        System.out.println("arr.length: " + arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: %d / ", i, arr[i]);
        }
        System.out.println();
        int[] tmp = new int[arr.length + 2];
        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        //System.arraycopy(arr, 0, tmp, 0, arr.length);
        arr = tmp;
        System.out.println(("[변경후]"));
        System.out.println("arr.length:" + arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: %d / ", i, arr[i]);
        }
    }
    /*
    result:
    [변경전]
    arr.length: 5
    arr[0]: 1 / arr[1]: 2 / arr[2]: 3 / arr[3]: 4 / arr[4]: 5 /
    [변경후]
    arr.length:7
    arr[0]: 1 / arr[1]: 2 / arr[2]: 3 / arr[3]: 4 / arr[4]: 5 / arr[5]: 0 / arr[6]: 0 /
     */
}
