import java.math.BigInteger;

public class Factorial implements Runnable {

    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public Factorial() {
        super();
    }

    public BigInteger fact(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            f = f.multiply(new BigInteger(Integer.toString(i)));
        }
        return f;

    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = 1; i <= this.number; i++) {
            if ( thr.isInterrupted()){
                System.out.println(thr.getName() + " Interapr");
                return;
            }
            System.out.println(thr.getName() + " " + i + " != " + fact(i));
        }
    }

}
