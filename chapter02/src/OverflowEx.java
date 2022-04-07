public class OverflowEx {
    public static void main(String[] args){
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin - 1 = " + (short)(sMin - 1));
        System.out.println("just => " + (sMin - 1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax - 1 = " + (short)(sMax + 1));
        System.out.println("just => " + (sMax + 1));
        System.out.println("cMin - 1 = " + (int)--cMin);
        System.out.println("just => " + --cMin);
        System.out.println("cMax + 1 = " + (int)++cMax);
        System.out.println("just => " + ++cMax);
    }
    /*
    result
    """
    sMin = -32768
    sMin - 1 = 32767
    just => -32769
    sMax = 32767
    sMax - 1 = -32768
    just => 32768
    cMin - 1 = 65535
    just => ￾
    cMax + 1 = 0
    just =>  (출력은 A로 나옴)
    """
     */
}
