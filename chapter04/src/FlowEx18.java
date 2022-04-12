public class FlowEx18 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            System.out.println(i);
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    }
    /*
2
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
.........
9 x 8 = 72
9 x 9 = 81
     */
}
