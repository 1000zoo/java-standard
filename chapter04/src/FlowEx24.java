public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;
        System.out.println("Count Down!");
        while(i-- != 0) {
            System.out.println(i);
            for(int j = 0; j <2_000_000_000; j++){;}
        }
        System.out.println("OVER");
    }
    /* result:
    Count Down!
    10
    9
    8
    7
    6
    5
    4
    3
    2
    1
    0
    OVER
     */
}
