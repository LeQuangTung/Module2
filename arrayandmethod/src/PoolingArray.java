import java.util.Arrays;
import java.util.Scanner;

public class PoolingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for (int i = 0; i<arr1.length;i++){
            System.out.println("Nhập phần tử cho mảng 1");
            arr1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i<arr2.length;i++){
            System.out.println("Nhập phần tử cho mảng 2");
            arr2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int pos = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0;i<arr1.length;i++){
            arr3[pos] = arr1[i];
            pos++;
        }
        for (int i = 0;i < arr2.length;i++){
            arr3[pos] = arr2[i];
            pos++;
        }
        System.out.println("Mảng sau khi gộp là:");
        System.out.print(Arrays.toString(arr3));

    }
}
