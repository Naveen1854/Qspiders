package programs;

import java.util.Scanner;

public class PrintNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener any Number: ");
		int num = sc.nextInt();
		print(num);
	}
	public static void print(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}
}
