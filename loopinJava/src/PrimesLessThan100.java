public class PrimesLessThan100 {
    public static void main(String[] args) {
        System.out.printf("Các số nguyên tố nhỏ hơn %d là: \n",100);
        int N = 2;
        while (N < 100){
            if (isPrimeNumber(N)) {
                System.out.print(N + " ");
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
