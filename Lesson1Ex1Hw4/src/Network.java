public class Network {
    private Phone[] phoneArr = new Phone[0];

    public Network() {
        super();
    }

    public Network(Phone[] phoneArr) {
        this.phoneArr = phoneArr;
    }

    private int chekerNumber(Phone phone) {
        for (int i = 0; i <= phoneArr.length; i++) {
            if (phoneArr[i].getNumber() == phone.getNumber()) {
                System.out.println("Номер " + phone.getNumber() + " уже зарегистрирован");
                return i;
            }
        }
        return -1;
    }

    public boolean addNumber(Phone phone) {
        if (chekerNumber(phone) != -1){

        }
    }


}
