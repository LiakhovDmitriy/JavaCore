public class Main {
    public static void main(String[] args) {
        /*
         * Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
         * Наделить его свойствами и методами. Создать несколько экземпляров объектов
         * этого класса. Использовать эти объекты.
         */

        //String name, int age, String nickname, int weight, int width, int height, String color

        Cat cat1 = new Cat("Vasiliy", 8, "Vaska", 2, 25, 58, "Gray");
        System.out.println("My cat's name is " + cat1.getName() + "\nHis age is " + cat1.getAge() + "\nHis nickname is " + cat1.getNickname() + "\nHis weight is " + cat1.getWeight() + " kg"+ "\nHis length is " + cat1.getLength() +" sm"+ "\nHis height is " + cat1.getHeight() +" sm"+ "\nHis colour is " + cat1.getColor());


    }
}
