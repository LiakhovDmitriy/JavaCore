public class Circle extends Shape {
    private Point a;
    private Point r;

    public Circle(Point a, Point r) {
        this.a = a;
        this.r = r;
    }
    public Circle(){
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getR() {
        return r;
    }

    public void setR(Point r) {
        this.r = r;
    }
    @Override
    public double getPerimetr() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", r=" + r +
                '}';
    }
}
