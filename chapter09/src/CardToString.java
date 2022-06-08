class Card01 {
    String kind;
    int number;

    Card01() {
        this("SPADE", 1);
    }

    Card01(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

public class CardToString {
    public static void main(String[] args) {
        Card01 c1 = new Card01();
        Card01 c2 = new Card01();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
