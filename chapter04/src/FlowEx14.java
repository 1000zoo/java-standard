public class FlowEx14 {
    public static void main(String[] args) {
        for(int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.printf("i = %d   \t  j = %d\n", i, j);
        }
    }
    /*
    result :
    i = 1   	  j = 10
    i = 2   	  j = 9
    i = 3   	  j = 8
    i = 4   	  j = 7
    i = 5   	  j = 6
    i = 6   	  j = 5
    i = 7   	  j = 4
    i = 8   	  j = 3
    i = 9   	  j = 2
    i = 10   	  j = 1
     */
}
