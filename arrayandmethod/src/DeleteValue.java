import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập sô muốn xóa: ");
        int X = input.nextInt();
        int index_del=-1;
        for (int i = 0; i < arr.length; i++){
            if (X == arr[i]) {
                index_del = i;
            }
        }
        if (index_del != -1){
            for (int j = index_del; j < arr.length-1; j++){
                arr[j] = arr[j+1];
                arr[j+1] = 0;
            }
        } else {
            System.out.println("Không nằm trong mảng");
        }
        System.out.print(Arrays.toString(arr));

    }
}
