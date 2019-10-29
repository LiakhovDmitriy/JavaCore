public class Persone {
    private boolean sex;
    private String name;
    private String lastName;
    private int age;

    public Persone(){
        super();
    }

    public Persone(boolean sex, String name, String lastName, int age) {
        this.sex = sex;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Sex = " + sex + ", Name = " + name + ", LastName = " + lastName + ", Age = " + age;
    }
}
