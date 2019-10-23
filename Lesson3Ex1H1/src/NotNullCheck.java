public class NotNullCheck {
    public static final int NOT_NULL = 11;

    public static int checkNull(Object a, Object b) {

        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return NOT_NULL;
    }
}
