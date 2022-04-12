public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
            System.out.printf("sum(1 ~ %2d) -> %2d\n", i, sum);
        }
    }
    /*
    result :
    sum(1 ~  1) ->  1
    sum(1 ~  2) ->  3
    sum(1 ~  3) ->  6
    sum(1 ~  4) -> 10
    sum(1 ~  5) -> 15
    sum(1 ~  6) -> 21
    sum(1 ~  7) -> 28
    sum(1 ~  8) -> 36
    sum(1 ~  9) -> 45
    sum(1 ~ 10) -> 55
     */
}
