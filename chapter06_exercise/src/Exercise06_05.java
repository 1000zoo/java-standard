class MyPoint {
    int x;
    int y;

    MyPoint (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double getDistance(int x1, int y1) {
        double dxSquare = Math.pow((x - x1), 2);
        double dySquare = Math.pow((y - y1), 2);
        return Math.pow((dxSquare + dySquare), 0.5);
    }
}

public class Exercise06_05 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1);
        System.out.println(p1.getDistance(2, 2));
    }
}
