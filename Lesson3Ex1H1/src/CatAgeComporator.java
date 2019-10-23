import java.util.Comparator;

public class CatAgeComporator implements Comparator {
    public CatAgeComporator() {
        super();
    }

    @Override
    public int compare(Object o1, Object o2) {
        int result = NotNullCheck.checkNull(o1, o2);
        if (result != NotNullCheck.NOT_NULL) {
            return -result;
        }
        Cat a = (Cat) o1;
        Cat b = (Cat) o2;

        if (a.getAge() > b.getAge()) {
            return 1;
        }
        if (a.getAge() < b.getAge()) {
            return -1;
        }

        return 0;
    }
}
