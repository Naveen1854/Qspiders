package practice;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		if(spy(num)) {
			System.out.println("SPY NUMBER");
		}else {
			System.out.println("NOT SPY NUMBER");
		}
		sc.close();
	}
	public static boolean spy(int num) {
		int sum = 0;
		int prod = 1;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			prod = prod * rem;
			num = num / 10;
		}
		return sum == prod;
	}
}
