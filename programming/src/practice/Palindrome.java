package practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		if(palindrome(num)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not paindrome");
		}
	}
	public static boolean palindrome(int num) {
		int original = num;
		int rev = 0;
		int rem;
		while(num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev == original;
	}
}
