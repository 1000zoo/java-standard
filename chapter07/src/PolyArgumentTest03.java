import java.util.*;

class Buyer__ extends Buyer {
    Vector item = new Vector();

    void buy (Product p) {
        super.buy(p);
        item.add(p);
    }

    void refund (Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println("refund " + p);
        } else {
            System.out.println("cant find");
        }
    }
    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("X");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product)item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("Total : " + sum);
        System.out.println("List : " + itemList);
    }
}

public class PolyArgumentTest03 {
    public static void main(String[] args) {
        Buyer__ b = new Buyer__();
        Tv_ tv = new Tv_();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
