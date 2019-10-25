public class Rectangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle() {
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;

    }

    private boolean checker() {
        double a1 = a.getDistance(b);
        double b1 = b.getDistance(c);
        double c1 = c.getDistance(d);
        double d1 = d.getDistance(a);

        if (a1 + b1 > a.getDistance(c) && b1 + c1 > b.getDistance(d) && c1 + d1 > c.getDistance(a) && d1 + a1 > d.getDistance(b)) {
            return true;
        }
        return false;
    }

    @Override
    public double getArea() {
        if (checker()==true) {
            double per = a.getDistance(b) + b.getDistance(c) + c.getDistance(d) + d.getDistance(a);
            return per;
        }
        return 0;
    }

    @Override
    public double getPerimetr() {
        double a1 = a.getDistance(b);
        double b1 = b.getDistance(c);
        double c1 = c.getDistance(d);
        double d1 = d.getDistance(a);
        double e = a.getDistance(c);
        double f = b.getDistance(d);

        if (checker()==true) {
            double sqr = Math.sqrt((((getArea() / 2.0) - a1) * ((getArea() / 2.0) - b1) * ((getArea() / 2.0) - c1) * ((getArea() / 2.0) - d1)) - (0.25 * ((a1 * c1) + (b1 * d1) + (e * f)) * (a1 * c1) + (b1 * d1) - (e * f)));
            return sqr;
        } else System.out.println("Your rectangle is BULLSHIT");
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
