public class Student extends Persone {
    private String nameOfTheGroup;
    private int scoreBook;

    public Student() {
        super();
    }

    public Student(boolean sex, String name, String lastName, int age, int scoreBook) {
        super(sex, name, lastName, age);
        this.scoreBook = scoreBook;
    }

    public String getNameOfTheGroup() {
        return nameOfTheGroup;
    }

    public void setNameOfTheGroup(String nameOfTheGroup) {
        this.nameOfTheGroup = nameOfTheGroup;
    }

    public int getScoreBook() {
        return scoreBook;
    }

    public void setScoreBook(int scoreBook) {
        this.scoreBook = scoreBook;
    }

    @Override
    public String toString() {
        return "Student " + "Name of the group = " + nameOfTheGroup + ", Score book = " + scoreBook + super.toString() + ".";
    }
}
