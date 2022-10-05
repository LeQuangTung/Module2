import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        String text1 = "",text2 = "";

        if (num >= 0 && num < 20) {
            switch (num) {
                case 0: text1 = "Zero";
                break;
                case 1: text1 = "One";
                break;
                case 2: text1 = "Two";
                break;
                case 3: text1 = "Three";
                break;
                case 4: text1 = "Four";
                break;
                case 5: text1 = "Five";
                break;
                case 6: text1 = "Six";
                break;
                case 7: text1 = "Seven";
                break;
                case 8: text1 = "Eight";
                break;
                case 9: text1 = "Nine";
                break;
                case 10: text1 = "Ten";
                break;
                case 11: text1 = "Eleven";
                break;
                case 12: text1 = "Twelve";
                break;
                case 13: text1 = "Thirteen";
                break;
                case 14: text1 = "Fourteen";
                break;
                case 15: text1 = "Fifteen";
                break;
                case 16: text1 = "Sixteen";
                break;
                case 17: text1 = "Seventeen";
                break;
                case 18: text1 = "Eighteen";
                break;
                case 19: text1 = "Nineteen";
                break;
            }
            System.out.println(text1);
        } else {
            int result1 = num / 10;
            int result2 = num % 10;
            switch (result1) {
                case 2: text1 = "Twenty";
                break;
                case 3: text1 = "Thirty";
                break;
                case 4: text1 = "Forty";
                break;
                case 5: text1 = "Fifty";
                break;
                case 6: text1 = "Sixty";
                break;
                case 7: text1 = "Seventy";
                break;
                case 8: text1 = "Eighty";
                break;
                case 9: text1 = "Ninety";
                break;
            }
            switch (result2){
                case 1: text2 = "one";
                break;
                case 2: text2 = "two";
                break;
                case 3: text2 = "three";
                break;
                case 4: text2 = "four";
                break;
                case 5: text2 = "five";
                break;
                case 6: text2 = "six";
                break;
                case 7: text2 = "seven";
                break;
                case 8: text2 = "eight";
                break;
                case 9: text2 = "nine";
                break;
            }
            System.out.println(text1+"-"+text2);
        }
    }
}
