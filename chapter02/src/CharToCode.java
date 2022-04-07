public class CharToCode {
    public static void main(String[] args){
        char ch = 'A';
        int code = (int)ch;

        //%#X : 16진법
        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}
