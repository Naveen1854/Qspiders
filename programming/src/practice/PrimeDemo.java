package practice;

import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int first = sc.nextInt();
		System.out.println("Enter last Number: ");
		int last = sc.nextInt();
		System.out.println("prime numbers between "+ first+ " and "+last);
		int min = 0,max = 0;
		for (int i = first; i <= last; i++) {
			if(isprime(i)) {
				if(min==0) {
					min = i;
				}
				System.out.println(i);
				max = i;
			}
		}
		System.out.println(min+" + "+max + " = "+(min+max));
	}
	public static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
