package baitap2;

public class OddThread extends Thread{
    public void run() {
        for(int i =0;i<10;i++) {
            if(i%2!=0) {
                System.out.println(this.getName() +" "+ i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
