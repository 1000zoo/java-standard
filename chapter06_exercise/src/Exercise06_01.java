class NumCard {
    int num;
    boolean isKwang;

    NumCard() {
        num = 1;
        isKwang = true;
    }
    NumCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String info() {
        return "" + num + (isKwang ? "K" : "");
    }
}

public class Exercise06_01 {
    public static void main(String[] args) {
        NumCard card1 = new NumCard(3, false);
        NumCard card2 = new NumCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
