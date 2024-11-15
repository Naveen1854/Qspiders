package programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Find the number of digits
        int originalNumber = number;
        int digits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }
        
        // Reset the number to original
        originalNumber = number;
        int sum = 0;
        
        // Calculate the sum of digits raised to the power of 'digits'
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, digits);
            originalNumber /= 10;
        }
        
        // Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
