package programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		if(isArmstrong(num)) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
			sc.close();
		}
	}
	public static boolean isArmstrong(int num) { //153
		int original = num;
		int sum = 0;
		int digits = String.valueOf(num).length(); // count digits = 3
		while(num != 0) {
			int digit  = num % 10;		// Get last digit
			sum += power(digit,digits);	// Calculate power and add to sum
			num /=10;					// Remove last digit
		}
		return sum == original;			// Check if sum equals the original number
	}
	public static int power(int base, int exp) {
		int result = 1;
		for(int i = 0; i < exp; i++) {
			result *= base;				// Multiply base 'exponent' times
		}
		return result;
	}
}
