public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d() {
        super();
    }

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public Vector3d vectorSumma(Vector3d a) {
        return new Vector3d(this.getX() + a.getX(), this.getY() + a.getY(), this.getZ() + a.getZ());
    }

    public double scalar(Vector3d a) {
        return this.getX() * a.getX() + this.getY() * a.getY() + this.getZ() * a.getZ();
    }

    public Vector3d vecMnog(Vector3d a) {
        return new Vector3d(this.getY() * a.getZ() - this.getZ() * a.getY(), this.getZ() * a.getX() - this.getX() * a.getZ(), this.getX() * a.getY() - this.getY() * a.getX());
    }


    public void printOut() {
        System.out.println("X = " + getX() + "; Y = " + getY() + "; Z = " + getZ() + ".");
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
