public class Network {
    Phone[] arr = new Phone[0];

    public Network() {
        super();
    }

    public boolean addPhone(Phone phone) {
        if (chekerNumber(phone) == -1) {
            System.out.println("Phone " + phone.getNumber() + " already register.");
            return false;
        }
        Phone[] time = new Phone[arr.length + 1];
        System.arraycopy(arr, 0, time, 0, arr.length);
        time[time.length - 1] = phone;
        arr = time;
        return true;
    }

    public int chekerNumber(Phone phone) {
        for (int i = 0; arr.length > i; i++) {
            if (arr[i].getNumber() == phone.getNumber()) {
                return i;
            }
        }
        return -1;
    }

    public Phone search(long number) {
        for (Phone phone : arr) {
            if (phone.getNumber() == number) {
                return phone;
            }
        }
        return null;
    }

    @Override
    public String toString() {

        StringBuilder br = new StringBuilder();
        for (int i = 0; arr.length > i; i++) {
            br.append("Fi");
            br.append(arr[i].toString());
            System.lineSeparator();
        }
        return br.toString();
    }
}
