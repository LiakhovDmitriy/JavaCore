public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public boolean chekerTriangl() {
        if (a.getDistance(b) + b.getDistance(c) > c.getDistance(a) && b.getDistance(c) + c.getDistance(a) > a.getDistance(b) && c.getDistance(a) + a.getDistance(b) > b.getDistance(c)) {
            return true;
        } else return false;
    }

    @Override
    public double getPerimetr() {
        if (chekerTriangl() == true) {
            double per = a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
            return per;
        } else System.out.println("Your triangle is bullshit");
        return 0;
    }

    @Override
    public double getArea() {
        if (chekerTriangl() == true) {
            double polP = getPerimetr() / 2.0;
            double sqr = 1 / 4.0 * Math.sqrt((a.getDistance(b) + b.getDistance(c) + c.getDistance(a)) * (b.getDistance(c) + c.getDistance(a) - a.getDistance(b)) * (c.getDistance(a) + a.getDistance(b) - b.getDistance(c)));
            return sqr;
        } else System.out.println("Your triangle is bullshit!!!!!!!!!!");
        return 0;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
