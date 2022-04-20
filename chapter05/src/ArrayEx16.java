public class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수: " + args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] => %s \n", i, args[i]);
        }
    }
    /*
    result:
    {path}@{path} src % java ArrayEx16.java abc 123 ksdf
    매개변수의 개수: 3
    args[0] => abc
    args[1] => 123
    args[2] => ksdf
     */
}
