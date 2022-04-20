public class ArrayEx05 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 99, 88, 77, 44};
        for (int j : score) {
            sum += j;
        }
        average = sum / (float)score.length;
        System.out.println("총점:" + sum);
        System.out.println("평균:" + average);
    }
    /*
    result:
    총점:408
    평균:81.6
     */
}
