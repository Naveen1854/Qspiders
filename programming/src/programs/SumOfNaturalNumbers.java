package programs;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		int result = print(num);
//		System.out.println(print(num));
		System.out.println(result);

	}
	public static int print(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
		return sum;
	}

}
