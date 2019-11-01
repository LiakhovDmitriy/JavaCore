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
        double a1 = a.getDistance(b);
        double b1 = b.getDistance(c);
        double c1 = c.getDistance(a);
        if (a1 + b1 > c1 && b1 + c1 > a1 && c1 + a1 > b1) {
            return true;
        }
        return false;
    }

    @Override
    public double getPerimetr() {
        double a1 = a.getDistance(b);
        double b1 = b.getDistance(c);
        double c1 = c.getDistance(a);
        if (chekerTriangl() == true) {
            double per = a1 + b1 + c1;
            return per;
        } else System.out.println("Your triangle is bullshit");
        return 0;
    }

    @Override
    public double getArea() {
        double a1 = a.getDistance(b);
        double b1 = b.getDistance(c);
        double c1 = c.getDistance(a);
        if (chekerTriangl() == true) {
            double polP = getPerimetr() / 2.0;
            double sqr = 0.25 * Math.sqrt((a1 + b1 + c1) * (b1 + c1 - a1) * (c1 + a1 - b1));
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
