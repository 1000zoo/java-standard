public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for(int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;
            for(int j = 0; j < numArr.length - 1; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
            for(int k : numArr) {
                System.out.print(k);
            }
//            System.out.println(Arrays.toString(numArr));
            System.out.println();
        }
    }
    /*
    result:
    0593087243
    0530872439
    0305724389
    0035243789
    0032435789
    0023345789
     */
}
