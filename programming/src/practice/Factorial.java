package practice;

import java.util.Scanner;

//Recursion Method the method calls itself:
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " is: " + factorial(num));
	}
	public static int  factorial(int num) {
//		if(num == 0) return 1;
//		return num * factorial(num-1);
		
		
		//Normal Method:
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact *= i;
		}
		return fact;
	}
}


