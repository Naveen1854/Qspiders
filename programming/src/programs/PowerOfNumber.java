package programs;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Base");
		int base = sc.nextInt();
		System.out.println("Enter a Exp");
		int exp = sc.nextInt();
		System.out.println(power(base,exp));
	}
	public static int power(int base, int exp) {
		int power = 1;
		for(int i = 1; i <= exp; i++) {
			power = power*base;
		}
		return power;
	}
}
