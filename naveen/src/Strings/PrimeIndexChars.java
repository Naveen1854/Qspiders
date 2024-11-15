package Strings;

import java.util.Scanner;

public class PrimeIndexChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			if(isPrime(i)) {
				System.out.println(str.charAt(i)+" ");
			}
		}
	}
	public static boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for (int i = 2; i<=Math.sqrt(a); i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
	}
}