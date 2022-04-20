public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();
        for(int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }
//1       for (int j : numArr) {
//            counter[j]++;
//        }
        for(int i = 0; i < numArr.length; i++) {
            System.out.printf("count of %d => %d\n", i, counter[i]);
        }
    }
    /*
    result:
    5077241903
    count of 0 => 2
    count of 1 => 1
    count of 2 => 1
     */
}
