class Product {
    int price;
    int bonusPoint;

    Product (int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product () {}
}

class Tv_ extends Product {
    Tv_() {
        super(100);
    }
    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString(){ return "Computer"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy (Product p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "구매");
    }
}

public class PolyArgumentTest01 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv_());
        b.buy(new Computer());

        System.out.println("current money : " + b.money);
        System.out.println("current bonusPoint : " + b.bonusPoint);
    }
}
