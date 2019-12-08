public class Circle {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public double getAr() {
        double are = Math.PI * rad * rad;
        return are;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                '}';
    }
}
