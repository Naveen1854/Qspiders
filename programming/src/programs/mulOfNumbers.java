package programs;

import java.util.Scanner;

public class mulOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		System.out.print(print(num));
		sc.close();
	}
	public static int print(int num) {
		int	result = 0;
		int i;
		for(i=0;i<=num;i++) {
			result += i;
		}
		return result;
	}
}
