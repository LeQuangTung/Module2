import java.util.Scanner;

public class Print20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n",number);
        int count = 0;
        int N = 2;
        while (count < number){
            if (isPrimeNumber(N)) {
                System.out.println(N + "");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
