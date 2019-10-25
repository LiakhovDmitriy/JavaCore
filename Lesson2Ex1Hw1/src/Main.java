import java.text.DecimalFormat;

public class Main {

    /*
     * Создайте абстрактный класс Shape, в котором есть два абстрактных метода double getPerimetr() и double getArea().
     * Создайте класс Point, в котором есть два свойства double x double y.
     * Создайте классы, которые описывают, как минимум, три геометрические фигуры (они должны быть подклассами
     * Shape). При этом они в качестве свойств должны содержать классы Point.
     */

    public static void main(String[] args) {

        Point a = new Point(1, 1);
        Point b = new Point(1, 5);
        Point c = new Point(4, 1);
        Point d = new Point(4, 5);

        DecimalFormat f = new DecimalFormat("##.00");

        Triangle tr = new Triangle(a, b, c);
        System.out.println("Triangle perimeter " + f.format(tr.getPerimetr()) + " centimeter");
        System.out.println("Area of a triangle " + f.format(tr.getArea()) + " square centimeter" + "\n");

        Circle cr = new Circle(a, b);
        System.out.println("Circle perimeter " + f.format(cr.getPerimetr()) + " centimeter");
        System.out.println("Area of a circle " + f.format(cr.getArea()) + " square centimeter"+ "\n");

        Rectangle rec = new Rectangle(a, b, c, d);
        System.out.println("Rectangle perimeter " + f.format(rec.getPerimetr()) + " centimeter");
        System.out.println("Area of a rectangle " + f.format(rec.getArea()) + " square centimeter");

    }

}
