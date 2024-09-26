package practice;

import java.util.Scanner;

public class Fabinocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range: ");
		int range = sc.nextInt();
		int num1=0,num2=1;
		for(int i=0;i<=range;i++) {
		System.out.print(num1 +" ");
		int num3 = num1+num2;
		num1=num2;
		num2=num3;
		sc.close();
		}
	}
}
