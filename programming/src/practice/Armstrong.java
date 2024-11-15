package practice;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		if(isArmstrong(num)) {
			System.out.println(num + " Armstrong_Number");
		}else {
			System.out.println(num + " Not Armstrong_Number");
			sc.close();
		}
	}
	public static boolean isArmstrong(int num) {
		int count = 0;
		while(num > 0) {
			num = num / 10;
			count ++;
		}
		int exp = count;
		int num3 = num;
		int sum = 0;
		while(num != 0) {
			int base = num % 10;
			sum = sum + power(base, exp);
			num3=num3/10;
		}
		return sum == num;
	}
	public static int power(int base, int exp) {
		int power = 1;
		for(int i = 1;i<= exp; i++) {
			power = power*base;
		}
		return power;
	}
}
