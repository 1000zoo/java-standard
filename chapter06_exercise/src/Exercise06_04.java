public class Exercise06_04 {
    static double getDistance(int x, int y, int x1, int y1) {
        double dxSquare = Math.pow((x - x1), 2);
        double dySquare = Math.pow((y - y1), 2);
        return Math.pow((dxSquare + dySquare), 0.5);
    }
    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
