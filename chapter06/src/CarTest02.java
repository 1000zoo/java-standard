class Car_ {
    String color;
    String gearType;
    int door;

    Car_() {
        this("white", "auto", 4);
    }
    Car_(String color) {
        this(color, "auto", 4);
    }
    Car_(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest02 {
    public static void main (String[] args) {
        Car_ c1 = new Car_();
        Car_ c2 = new Car_("Blue");
        System.out.println("c1 => " + c1.color + c1.gearType + c1.door);
        System.out.println("c2 => " + c2.color + c2.gearType + c2.door);
    }
}
