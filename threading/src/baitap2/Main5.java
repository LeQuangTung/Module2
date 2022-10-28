package baitap2;

public class Main5 {
    public static void main(String[] args) throws InterruptedException {
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();
        Thread t1 = new Thread(ot);
        Thread t2 = new Thread(et);
        ot.setName("ODDThread");
        et.setName("EVENThread");
        t1.start();
        t1.join();
        t2.start();
    }
}
