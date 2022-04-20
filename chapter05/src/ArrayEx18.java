public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {80, 98, 79},
                {88, 99, 77}
        };
        int sum = 0;
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] => %d\n", i, j, score[i][j]);
            }
        }
        for(int[] tmp : score) {
            for(int i : tmp) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
    /*
    result:
    score[0][0] => 100
    score[0][1] => 100
    score[0][2] => 100
    score[1][0] => 20
    score[1][1] => 20
    score[1][2] => 20
    score[2][0] => 80
    score[2][1] => 98
    score[2][2] => 79
    score[3][0] => 88
    score[3][1] => 99
    score[3][2] => 77
    sum = 881
     */
}
