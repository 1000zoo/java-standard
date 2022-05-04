class Datal {
    int value;
}
class Datal2 {
    int value;
    Datal2 (int x) {
        value = x;
    }
}
public class ConstructorTest {
    public static void main (String[] args) {
        Datal d1 = new Datal();
        Datal2 d2 = new Datal2(3);
    }
}
