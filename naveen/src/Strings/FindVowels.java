package Strings;

import java.util.Scanner;

public class FindVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			switch(ch) {
			case 'a','e','i','o','u','A','E','I','O','U':System.out.println(ch);
			}
			sc.close();
		}
	}
}
