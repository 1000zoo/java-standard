abstract class Shape {
    Point p;

    Shape(Point p) {
        this.p = p;
    }

    abstract double calArea();

    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        super(new Point());
        this.r = r;
    }
    double calArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        super(new Point());
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {
        return width == height;
    }

    double calArea(){ return width * height; }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}

public class Exercise07_07 {
    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (Shape s : arr) {
            sum += s.calArea();
        }
        return sum;
    }
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("sumArea : " + sumArea(arr));
    }
}
