public class CastingTest01 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car) fe;
        //  car.water() <= error
        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Br-");;
    }

    void stop() {
        System.out.println("STOP!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("WATER!!");
    }
}