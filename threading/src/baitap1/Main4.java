package baitap1;

public class Main4 {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator);

        thread1.start();
        thread2.start();
    }
}

