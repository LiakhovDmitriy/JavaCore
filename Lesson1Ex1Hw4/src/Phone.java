public class Phone {
    private long numberPhone;
    private String namePhone;
    private Network network;

    public Phone(long numberPhone, String namePhone, Network network) {
        this.numberPhone = numberPhone;
        this.namePhone = namePhone;
        this.network = network;
    }

    public Phone() {
        super();
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "numberPhone=" + numberPhone +
                ", namePhone='" + namePhone + '\'' +
                '}';
    }
}
