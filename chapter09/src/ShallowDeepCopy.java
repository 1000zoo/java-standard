class Circle01 implements Cloneable {
    Point02 p;
    double r;

    Circle01 (Point02 p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle01 shallowCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle01) obj;
    }

    public Circle01 deepCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        Circle01 c = (Circle01) obj;
        c.p = new Point02(this.p.x, this.p.y);
        return c;
    }

    public String toString() {
        return "[p = " + p + ", r = " + r + "]";
    }
}

class Point02 {
    int x, y;

    Point02 (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle01 c1 = new Circle01(new Point02(1,1), 2);
        Circle01 c2 = c1.shallowCopy();
        Circle01 c3 = c1.deepCopy();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        c1.p.x = 9;
        c1.p.y = 9;
        c1.r = 3;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
