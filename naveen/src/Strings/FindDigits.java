package Strings;

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
//			if(ch>='0'&& ch<='9') {
//				System.out.println(ch);
//			}
			if(Character.isDigit(ch)) {
//				System.out.println(ch);
				String res = ch+"";
				int dig = Integer.parseInt(res);
				sum = sum + dig;
			}
		}
		System.out.println(sum);
		Integer i = Integer.valueOf(2);
		System.out.println(i);
		
		Integer b = 10;
		int a = b;
		System.out.println(a);
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
}
