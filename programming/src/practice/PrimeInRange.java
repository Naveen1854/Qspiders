package practice;

import java.util.Scanner;

public class PrimeInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int first = sc.nextInt();
		System.out.println("Enter Last Number: ");
		int last = sc.nextInt();
		System.out.println("Prime numbers between " + first + " and " + last + ":");
		int num;
		for(num=first;num<=last;num++) {
			if(isPrime(num)) {
				System.out.println(num + " ");
				sc.close();
			}
		}
	}
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
