class Point01 implements Cloneable {
    int x, y;

    Point01(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e){}
        return obj;
    }
}

public class CloneEx01 {
    public static void main(String[] args) {
        Point01 original = new Point01(3, 5);
        Point01 copy = (Point01) original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
