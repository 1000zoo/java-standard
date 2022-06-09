public class Exercise09_11 {
    public static void main(String[] args) {
        int from = 0;
        int to = 0;
        try {
            if(args.length!=2)
                throw new Exception("err");
            from = Integer.parseInt(args[0]);
            to = Integer.parseInt(args[1]);
            if(!(2 <= from && from <= 9 && 2 <= to && to <= 9))
                throw new Exception("err");
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("");
            System.exit(0);
        }
        if(from > to) {
            int tmp = from;
            from = to;
            to = tmp;
        }
        for(int i=from;i<=to;i++) {
            for(int j=1;j<=9;j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
