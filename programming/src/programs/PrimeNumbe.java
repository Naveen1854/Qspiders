package programs;

import java.util.Scanner;

public class PrimeNumbe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;	
	}
}
