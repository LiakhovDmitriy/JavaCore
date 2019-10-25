import java.text.DecimalFormat;

public class Main {

    /*
     * Создайте абстрактный класс Shape, в котором есть два абстрактных метода double getPerimetr() и double getArea().
     * Создайте класс Point, в котором есть два свойства double x double y.
     * Создайте классы, которые описывают, как минимум, три геометрические фигуры (они должны быть подклассами
     * Shape). При этом они в качестве свойств должны содержать классы Point.
     */
    public static void main(String[] args) {

        Point a = new Point(2, 1);
        Point b = new Point(2, 2);
        Point c = new Point(3, 3);

        DecimalFormat f = new DecimalFormat("##.00");

        Triangle tr = new Triangle(a, b, c);
        System.out.println("Triangle perimeter " + f.format(tr.getPerimetr()) + " centimeter");
        System.out.println("Area of a triangle " + f.format(tr.getArea()) + " square centimeter");


    }

}
