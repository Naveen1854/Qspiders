package practice;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		if(armstrong(num)) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
			sc.close();
		}
	}
	public static boolean armstrong(int num) {
		// Find the Number of Digits
		int original = num;
		int digits = 0;
		while(original > 0) {
			original = original / 10;
			digits++;
		}
		System.out.println("digits: " + digits);
		original = num;
		int sum = 0;
		
		//calculate sum of digits raised to the power of digits
		while(original > 0) {
			int digit = original % 10;
			sum = sum+power(digit,digits);
			original = original/10;
		}
		return sum == num;
	}
		public static int power(int digit, int digits) {
			int power = 1;
			for(int i = 1; i <= digits; i++) {
				power = power * digit;
			}
			return power;
	}
}
