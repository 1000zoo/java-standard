public class ConstantAndLiteral {
    public static void main(String[] args){
        //Constant
        final int WIDTH = 20;
        final int HEIGHT = 10;

        int triangleArea = (WIDTH * HEIGHT) / 2;
        int rectangleArea = WIDTH * HEIGHT;

        //Literal
        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        long big = 100_000_000_000L; //L을 붙혀야됨
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        float pi = 3.14f; //float 에는 f 가 필수
        double rate = 1.618d;
        double rate_ = 1.42;

        //타입 불일치
        int i = 'A';    //아스키코드가 들어감
        long l = 123;
        double d = 2.123f; //둘다 범위가 더 넓어서 괜찮다.

        //char & string
        char c = 'j';
        String ch = "j";
        String name = "JAVA";
        String cName = new String("JAVA");
        String naPlusMe = "JA" + "VA";
        String str = name + 8.0;
    }
}
