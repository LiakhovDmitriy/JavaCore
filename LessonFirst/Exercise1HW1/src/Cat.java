public class Cat {

    private String name;
    private int age;
    private String nickname;
    private int weight;
    private int length;
    private int height;
    private String color;

    public Cat(String name, int age, String nickname, int weight, int length, int height, String color) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.color = color;
    }
    public Cat(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
