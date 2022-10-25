import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    private int speed(){
        return speed();
    }

    private boolean on(){
        if (true) {
            System.out.println("Fan is on.");
            System.out.println("Speed: " + speed());
            System.out.println("Color: " + color());
            System.out.println("Radius: " + radius());
        } else {
            System.out.println("Fan is off");
        }
        return on();
    }

    private double radius(){
        return radius();
    }

    private String color(){
        return color();
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Open the fan");

    }
}

