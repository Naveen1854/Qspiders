package functions;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int first = sc.nextInt();
		System.out.println("Enter second Number: ");
		int last = sc.nextInt();
		System.out.println("Prime Numbers between: "+ first +" and " +  last);
		for(int i=first;i<=last;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}return true;
	}
}
