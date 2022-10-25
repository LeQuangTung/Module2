import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation (double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return (this.b * this.b - 4 * this.a * this.c);

    }

    public double getRoot1() {
        return ((-1*b) + Math.sqrt(this.delta())) / (2 * a);
    }

    public double getRoot2() {
        return  ((-1*b) - Math.sqrt(this.delta())) / (2 * a);

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter number a:");
        double a = scanner.nextDouble();
        System.out.print("Enter number b:");
        double b = scanner.nextDouble();
        System.out.print("Enter number c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.delta();
        if (delta < 0){
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("The equation has root is: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has 2 roots are: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
    }
}
