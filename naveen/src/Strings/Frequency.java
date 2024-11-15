package Strings;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		frequency(str);
	}
	public static void frequency(String str) {
		for(int i=0;i<str.length();i++) {
			int count = 0;
			char ch = str.charAt(i);
			for(int j=0;j<str.length();j++) {
				char ch1 = str.charAt(j);
				if(ch == ch1) count++;	
			}
			System.out.println(ch +" "+ count);
		}
	}
}
