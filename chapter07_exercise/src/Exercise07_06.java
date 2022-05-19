public class Exercise07_06 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv01());
        b.buy(new Computer());
        b.buy(new Tv01());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy (Product p) {
        if (money < p.price) {
            System.out.println("잔액부족" + p + "살수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }
    void add (Product p) {
        if (i >= cart.length) {
            Product[] tmp = new Product[cart.length * 2];
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            cart = tmp;
        }
        cart[i++] = p;
    }
    void summary() {
        System.out.print("구입물건 : ");
        for (Product product : cart) {
            System.out.print(product + ", ");
        }
        System.out.println();
        System.out.println("사용금액 : " + (1000 - money));
        System.out.println("현재금액 : " + money);
    }
}

class Product {
    int price;

    Product (int price) {
        this.price = price;
    }
}

class Tv01 extends Product {
    Tv01() {
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}