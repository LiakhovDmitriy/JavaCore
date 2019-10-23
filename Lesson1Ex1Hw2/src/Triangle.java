public class Triangle {

    private double site1;
    private double site2;
    private double site3;

    public Triangle(double site1, double site2, double site3) {
        this.site1 = site1;
        this.site2 = site2;
        this.site3 = site3;
    }

    public Triangle() {
        super();
    }

    public double getSite1() {
        return site1;
    }

    public void setSite1(double site1) {
        this.site1 = site1;
    }

    public double getSite2() {
        return site2;
    }

    public void setSite2(double site2) {
        this.site2 = site2;
    }

    public double getSite3() {
        return site3;
    }

    public void setSite3(double site3) {
        this.site3 = site3;
    }

    public double sqr(double site1, double site2, double site3) {
        double p = (site1 + site2 + site3) / 2.0;
        double sqr = Math.sqrt(p * (p - site1) * (p - site2) * (p - site3));
        return sqr;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "site1=" + site1 +
                ", site2=" + site2 +
                ", site3=" + site3 +
                '}';
    }
}
