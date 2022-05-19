class SutdaDeck01 {
    final int CARD_NUM = 20;
    final SutdaCard01[] cards = new SutdaCard01[CARD_NUM];

    static boolean kwangDetector(int i) {
        int m = i / 10;
        int r = i % 10;
        if (m == 1) {
            return false;
        } else if (m == 0) {
            return r == 0 || r == 2 || r == 7;
        }
        return false;
    }

    SutdaDeck01() {
        for (int i = 0; i < CARD_NUM; i++) {
            cards[i] = new SutdaCard01(i % 10 + 1,  kwangDetector(i));
        }
    }
}

class SutdaCard01 {
    int num;
    boolean isKwang;

    SutdaCard01 (int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise07_01 {
    public static void main(String[] args) {
        SutdaDeck01 deck = new SutdaDeck01();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
    }
}
