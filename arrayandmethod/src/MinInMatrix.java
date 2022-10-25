import java.util.Scanner;

public class MinInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrix = new int[3][3];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length; j++){
                System.out.println("Nhập phần tử vào mảng 2 chiều");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int min = matrix[0][0];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length; j++){
                if (min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + min);
    }
}
