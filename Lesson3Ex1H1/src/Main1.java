import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 5);
        Cat cat2 = new Cat("Kuzia", 3);
        Cat cat3 = new Cat("Umka", 10);
        Cat cat4 = new Cat("Murka", 7);
        Cat cat5 = new Cat("Barsik", 1);

        Cat[] cats = new Cat[]{cat1, cat2, null, cat4, null};

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
        System.out.println();


        Arrays.sort(cats, new CatAgeComporator());

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
        System.out.println();
    }
}
