public class Phone {
    private long number;
    private String name;
    private Network network;

    public Phone(long number, String name) {
        this.number = number;
        this.name = name;
    }
    public Phone(){
        super();
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public void registerToNetwork(Network network) {
        this.network = network;
        if (!this.network.addPhone(this)) {
            this.network = null;
        }
    }

}
