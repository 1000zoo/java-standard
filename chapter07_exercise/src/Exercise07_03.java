class Product01 {
    int price;
    int bonusPoint;

//    Product01 () {}

    Product01 (int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product01 {
    Tv() {
        super(300);
    }

    public String toString() {
        return "Tv";
    }
}

public class Exercise07_03 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
