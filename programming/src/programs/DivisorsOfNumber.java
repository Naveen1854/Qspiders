// Find divisors of given number:

package programs;

import java.util.Scanner;

public class DivisorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		noOfDivisors(num);
		sc.close();
	}
	public static void noOfDivisors(int num) {
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				System.out.print("Divisor: ");
				System.out.println(i);
			}
		}
	}
}
