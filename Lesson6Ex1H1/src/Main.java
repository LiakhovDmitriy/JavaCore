public class Main {
    public static void main(String[] args) {


        Thread mainThred = Thread.currentThread().currentThread();
//        System.out.println(mainThred.getName());
//        System.out.println(mainThred.getId());

        Factorial task1 = new Factorial(10000);
        Factorial task2 = new Factorial(10000);
        Factorial task3 = new Factorial(10000);

        Thread thr1 = new Thread(task1);
        Thread thr2 = new Thread(task2);
        Thread thr3 = new Thread(task3);

        thr1.start();
        thr2.start();
        thr3.start();

//        thr1.interrupt();
//        thr2.interrupt();
//        thr3.interrupt();





        /*
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

         */


        System.out.println(mainThred.getName() + " STOP");
    }
}
