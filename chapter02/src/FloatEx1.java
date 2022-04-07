public class FloatEx1 {
    public static void main(String[] args){
        float f1 = 9.29384728391857192857f;
        float f2 = 1.4938172849103847593f;      //총 7자리 까지 저장 가능 (정밀도)
        double d = 9.12345678901234567980;
        double d2 = 1232651346134513.24;        //총 17자리 까지 저장 가능 (정밀도)

        System.out.printf("       123456789012345678901234%n");
        System.out.printf("f1   : %f%n", f1);
        System.out.printf("f1   : %24.20f%n", f1);
        System.out.printf("f2   : %24.20f%n", f2);
        System.out.printf("d    : %24.20f%n", d);
        System.out.printf("d2   : %f", d2);
    }
    /*
    result
    """
           123456789012345678901234
    f1   : 9.293847
    f1   :   9.29384708404541000000
    f2   :   1.49381732940673830000
    d    :   9.12345678901234600000
    d2   : 1232651346134513.200000
    """
     */
}
