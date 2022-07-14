import java.util.*;

class Fruit04 {
    String name;
    int weight;

    Fruit04(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "(" + weight + ")";
    }
}

class Apple04 extends Fruit04 {
    Apple04(String name, int weight) {
        super(name, weight);
    }
}
class Grape04 extends Fruit04 {
    Grape04(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple04> {
    public int compare(Apple04 t1, Apple04 t2) {
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape04> {
    public int compare(Grape04 t1, Grape04 t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit04> {
    public int compare(Fruit04 t1, Fruit04 t2) {
        return t2.weight - t1.weight;
    }
}

public class FruitBoxEx04 {
    public static void main(String[] args) {
        FruitBox04<Fruit04> fruitBox = new FruitBox04<>();
        FruitBox04<Apple04> appleBox = new FruitBox04<>();
        FruitBox04<Grape04> grapeBox = new FruitBox04<>();

        appleBox.add(new Apple04("GreenApple", 300));
        appleBox.add(new Apple04("GreenApple", 400));
        appleBox.add(new Apple04("GreenApple", 100));
        appleBox.add(new Apple04("GreenApple", 500));
        appleBox.add(new Apple04("GreenApple", 200));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();
    }
}

class FruitBox04<T extends Fruit04> extends Box<T> {}