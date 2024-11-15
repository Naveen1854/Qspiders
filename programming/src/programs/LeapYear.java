package programs;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int year = sc.nextInt();
		if(leapyear(year)) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a Leap Year");
		}
		sc.close();
	}
	public static boolean leapyear(int year) {
		if(year % 4 == 0  && year % 100 != 0) {
			return true;
		}else if(year % 400 == 0){
			return true;
		}else {
			return false;
		}
	}
}
