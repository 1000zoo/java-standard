public class ArrayEx06 {
    public static void main(String[] args) {
        int[] score = {66, 20, 40, 50, 67, 78, 88};

        int max = score[0];
        int min = score[0];

        for(int tmp : score) {
            if(tmp > max) {
                max = tmp;
            } else if (tmp < min) {
                min = tmp;
            }
        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
    /*
    result:
    MAX: 88
    MIN: 20
     */
}
