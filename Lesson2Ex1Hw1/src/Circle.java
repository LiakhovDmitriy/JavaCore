public class Circle extends Shape {
    private Point a;
    private Point r;

    public Circle(Point a, Point r) {
        this.a = a;
        this.r = r;
    }

    public Circle() {
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
        double per = Math.PI * 2 * this.r.getDistance(a);
        return per;
    }

    @Override
    public double getArea() {
        double ar = Math.PI * (2 * this.r.getDistance(a)) * (2 * this.r.getDistance(a));
        return ar;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", r=" + r +
                '}';
    }
}
