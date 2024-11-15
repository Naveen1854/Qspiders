package Strings;

import java.util.Scanner;

public class RemDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		String ans = remDup(str);
		System.out.println(ans);
	}
	
	public static String remDup(String str) {
		String res  = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(! res.contains(ch+"")) {
				res=res+ch;
			}
		}
		return res;
	}
}
