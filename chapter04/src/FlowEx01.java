public class FlowEx01 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d => True is", x);

        if(x == 0) {
            System.out.println("x==0");
        }
        if(x != 0) {
            System.out.println("x!=0");
        }
        if(!(x == 0)) {
            System.out.println("!(x == 0)");
        }
        if(!(x != 0)) {
            System.out.println("!(x != 0)");
        }

        x = 1;
        if(x == 0) {
            System.out.println("x==0");
        }
        if(x != 0) {
            System.out.println("x!=0");
        }
        if(!(x == 0)) {
            System.out.println("!(x == 0)");
        }
        if(!(x != 0)) {
            System.out.println("!(x != 0)");
        }
    }
    /*
    result :
    x=0 => True isx==0
    !(x != 0)
    x!=0
    !(x == 0)
     */
}
