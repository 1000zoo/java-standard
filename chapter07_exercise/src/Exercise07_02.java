class SutdaDeck02 {
    final int CARD_NUM = 20;
    SutdaCard02[] cards = new SutdaCard02[CARD_NUM];

    SutdaDeck02() {
        for (int i = 0; i < CARD_NUM; i++) {
            cards[i] = new SutdaCard02(i % 10 + 1,  kwangDetector(i));
        }
    }

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

    void shuffle() {
        for (int i = 0; i < 100; i++) {
            int randIndex = (int) (Math.random() * CARD_NUM);

            SutdaCard02 tmp = cards[0];
            cards[0] = cards[randIndex];
            cards[randIndex] = tmp;
        }
    }

    SutdaCard02 pick() {
        return cards[(int) (Math.random() * CARD_NUM)];
    }
    SutdaCard02 pick(int i) {
        return cards[i];
    }
}

class SutdaCard02 {
    int num;
    boolean isKwang;

    SutdaCard02() {
        this(1, true);
    }
    SutdaCard02 (int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise07_02 {
    public static void main(String[] args) {
        SutdaDeck02 deck = new SutdaDeck02();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
