public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Green");
        car1.setWeight(2000);
        car1.setYear(1985);
        car1.acceleration(123);

        Car car2 = new Car("Red", 2000, 1985);

        System.out.println(car1);
        System.out.println();
        System.out.println(car2);

    }
}
