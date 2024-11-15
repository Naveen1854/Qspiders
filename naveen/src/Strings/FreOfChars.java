package Strings;

import java.util.Scanner;

public class FreOfChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s = sc.next();
		
		String ans = remDup(s);
		frequencyCount(ans,s);
		sc.close();
	}
	
	public static String remDup(String s) {
		String res = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(! res.contains(ch+"")) {
				res = res+ch;
			}
		}
		return res;
	}
	
	public static void frequencyCount(String res,String s) {
		for(int i=0;i<res.length();i++) {
			int count = 0;
			char rch = res.charAt(i);
			for(int j=0;j<s.length();j++) {
				char sch = s.charAt(j);
				if(rch == sch) {
					count ++;
				}
			}
			System.out.println(rch + " " + count);
		}
	}
}
