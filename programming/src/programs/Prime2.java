package programs;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number: ");
		int num = sc.nextInt();
		if(isprime(num)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
			sc.close();
		}
	}
	public static boolean isprime(int num) {
		if(num<=1) return false;	
		for(int i =2; i<=num/2; i++) {
			if(num % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}
