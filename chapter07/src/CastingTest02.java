public class CastingTest02 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car1.drive();
        //fe = (FireEngine) car1; <= error / car1 이 Car 의 인스턴스이기 때문
        //fe.drive();
    }
}
