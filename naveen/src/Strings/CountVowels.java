package Strings;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			int count = 0;
			char ch = str.charAt(i);
			switch(ch) {
			case 'A','E','I','O','U','a','e','i','o','u':count++;
			}
			System.out.println(ch +" "+ count);
		}
		
	}
}
