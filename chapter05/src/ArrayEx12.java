public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"JW", "MJ", "MY"};
        for(int i = 0; i < names.length; i++) {
            System.out.printf("names[%d] : %s\n", i, names[i]);
        }
        String tmp = names[2];
        System.out.println("tmp:" + tmp);
        names[0] = "HP";

        for(String str : names) {
            System.out.println(str);
        }
    }
    /*
    result:
    names[0] : JW
    names[1] : MJ
    names[2] : MY
    tmp:MY
    HP
    MJ
    MY
     */
}
