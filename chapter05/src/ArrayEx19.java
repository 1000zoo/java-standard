public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {80, 98, 79},
                {88, 99, 77}
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        System.out.println("num    kor    eng    math   total  avg");
        System.out.println("========================================");

        for(int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            korTotal  += score[i][0];
            engTotal  += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i + 1);

            for(int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%7d", score[i][j]);
            }

            avg = sum / (float)score[i].length;
            System.out.printf("%7d %8.1f\n", sum, avg);
        }
        System.out.println("========================================");
        System.out.printf("total: %3d %4d %4d\n", korTotal, engTotal, mathTotal);
    }
    /*
    result:
    num    kor    eng    math   total  avg
    ========================================
      1    100    100    100    300    100.0
      2     20     20     20     60     20.0
      3     80     98     79    257     85.7
      4     88     99     77    264     88.0
    ========================================
    total: 288  317  276
     */
}
