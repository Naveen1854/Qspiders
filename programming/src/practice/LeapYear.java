package practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter any Year: ");
			int year = sc.nextInt();
			if(leap_year(year)) {
				System.out.println("Leap Year");
				System.out.println("---------------");
			}else {
				System.out.println("Not a Leap Year");
				System.out.println("---------------");
			}
		}
	}
	public static boolean leap_year(int year) {
		if(year % 4 == 0 && year % 100 != 0) {
			return true;
		}else if(year % 400 == 0){
			return true;
		}else {
			return false;
		}
	}
}
