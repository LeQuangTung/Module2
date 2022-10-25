import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class AddValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {4, 6, 7, 8, 0, 0, 0};
        System.out.println("Nhập số cần chèn:");
        int X = input.nextInt();
        System.out.println("Nhập vị trí cần chèn:");
        int index = input.nextInt();
        if (index <= -1 && index >= args.length-1){
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = index; i < arr.length-1;){
                arr[i+1] = arr[i];
            }
            arr[index] = X;
            System.out.println(Arrays.toString(arr));

        }
    }
}
