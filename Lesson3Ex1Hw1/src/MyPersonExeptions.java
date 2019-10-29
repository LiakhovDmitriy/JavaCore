public class MyPersonExeptions extends Exception {

    @Override
    public String getMessage() {
        return "Group is full";
    }

}
