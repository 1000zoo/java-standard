class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() { return "Audio"; }
}

class Buyer_ extends Buyer{
    Product[] item = new Product[10];
    int i = 0;
    void buy (Product p) {
        super.buy(p);
        item[i++] = p;
    }
    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                break;
            }
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("Total Price : " + sum);
        System.out.println("Products list : " + itemList);
    }
}

public class PolyArgumentTest02 {
    public static void main(String[] args) {
        Buyer_ b = new Buyer_();

        b.buy(new Tv_());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}
