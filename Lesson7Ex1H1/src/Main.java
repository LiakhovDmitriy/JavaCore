import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasia", 6);
        Cat cat2 = new Cat("Vasia", 6);
        Cat cat3 = cat2;
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat1.equals(cat2));

        Cat cat4 = null;
        try {
            cat4 = cat2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println(cat4 == cat2);
        System.out.println(cat4.equals(cat2));
        System.out.println(cat4.toString());
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        Class catClass = cat1.getClass();
        Field [] catField = catClass.getDeclaredFields();
        for (int i = 0; i < catField.length; i++) {
            System.out.println(catField[i]);
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        try {
            Field catAge = catClass.getDeclaredField("age");
            catAge.setAccessible(true);
            catAge.setInt(cat1,100500);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(cat1);

        Field [] catField1 = catClass.getDeclaredFields();
        for (int i = 0; i < catField.length; i++) {
            System.out.println(catField1[i]);
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        Method[] catMethod = catClass.getDeclaredMethods();
        for (int i = 0; i < catField.length; i++) {
            System.out.println(catMethod[i]);
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        Constructor[] catConstruktor = catClass.getDeclaredConstructors();
        for (int i = 0; i < catField.length; i++) {
            System.out.println(catConstruktor[i]);
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        Class[] catInterfase = catClass.getInterfaces();
        for (int i = 0; i < catField.length; i++) {
            System.out.println(catConstruktor[i]);
        }


    }
}
