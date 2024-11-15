package practice;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		System.out.println(reverse(num));
		sc.close();
	}
	public static int reverse(int num) {
		int rev = 0;
		while(num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}
}
