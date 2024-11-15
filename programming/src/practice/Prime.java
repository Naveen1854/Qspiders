package practice;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				return false;
			}
		}return true;
	}
}
