public class FlowEx29 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.printf("i=%d", i);

            int tmp = i;
            do {
                if(tmp % 10 % 3 == 0 && tmp % 10 !=0){
                    System.out.print("CLAP");
                }
            } while((tmp /= 10) != 0);
            System.out.println();
        }
    }
    /* result:
    i=1
    i=2
    i=3CLAP
    i=4
    i=5
    i=6CLAP
    i=96CLAPCLAP
    i=97CLAP
    i=98CLAP
    i=99CLAPCLAP
    i=100
     */
}
