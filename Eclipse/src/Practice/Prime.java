package Practice;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is Prime ");
			} else {
				System.out.println(i + " is not Prime");
			}
		}
	}

	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
