import java.util.ArrayList;

class Fruit02 implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple02 extends Fruit02 {
    public String toString() {
        return "Apple";
    }
}

class Grape02 extends Fruit02 {
    public String toString() {
        return "Grape";
    }
}

class Toy02 {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {}

public class FruitBoxEx02 {
    public static void main(String[] args) {
        FruitBox<Fruit02> fruitBox = new FruitBox<>();
        FruitBox<Apple02> appleBox = new FruitBox<>();
        FruitBox<Grape02> grapeBox = new FruitBox<>();

        fruitBox.add(new Fruit02());
        fruitBox.add(new Apple02());
        fruitBox.add(new Grape02());

        grapeBox.add(new Grape02());
        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);

    }
}

class FruitBox<T extends Fruit02 & Eatable> extends Box<T> {}

