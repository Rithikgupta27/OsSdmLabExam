import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
      int number = 120153;  
        int sum = calculateSumOfDigits(number);
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }

     private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
