package programs;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		System.out.println(countDigits(num));
	}
	public static int countDigits(int num) {
		int count = 0;
		while(num > 0) {
			num = num/10; // remove last
			count ++;
		}
		return count;
	}
}
