import java.util.ArrayList;

class Fruit03 {
    public String toString() {
        return "Fruit";
    }
}

class Apple03 extends Fruit03 {
    public String toString() {
        return "Apple";
    }
}

class Grape03 extends Fruit03 {
    public String toString() {
        return "Grape";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox03<? extends Fruit03> box) {
        String tmp = "";

        for (Fruit03 f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

class FruitBox03<T extends Fruit03> extends Box<T> {}

public class FruitBoxEx03 {
    public static void main(String[] args) {
        FruitBox03<Fruit03> fruitBox = new FruitBox03<>();
        FruitBox03<Apple03> appleBox = new FruitBox03<>();
        FruitBox03<Grape03> grapeBox = new FruitBox03<>();

        fruitBox.add(new Fruit03());
        fruitBox.add(new Apple03());
        fruitBox.add(new Grape03());

        grapeBox.add(new Grape03());
        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);

        System.out.println(Juicer.makeJuice(fruitBox));
    }
}
