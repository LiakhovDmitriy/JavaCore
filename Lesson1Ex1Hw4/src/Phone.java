public class Phone {
    private String brend;
    private long number;
    private Network network;


    public Phone(String brend, long number, Network network) {
        this.brend = brend;
        this.number = number;
        this.network = network;
    }

    public Phone(){
        super();
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void  registerPhone(Network network){
        this.network = network;
        if (!this.network.addPhone(this)) {
            this.network = null;
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brend='" + brend + '\'' +
                ", number=" + number +
                ", network=" + network +
                '}';
    }
}
