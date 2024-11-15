package practice;

import java.util.Scanner;

public class Palindrome1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		if(palindrome(num)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	public static boolean palindrome(int num) {
		int rev = 0;
		int temp = num;
		while(num>0) {
			int rem = num%10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		return temp == rev;
	}
}
