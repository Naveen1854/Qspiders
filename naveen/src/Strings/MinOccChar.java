package Strings;

import java.util.Scanner;

public class MinOccChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		String res = remDup(str);
		int minCount = Integer.MAX_VALUE;
		char minChar=' ';
		for(int i=0;i<res.length();i++) {
			int count = 0;
			for(int j=0;j<str.length();j++) {
				if(res.charAt(i)==str.charAt(j)) {
					count ++;
				}
			}
			if(count < minCount) {
				minCount = count;
				minChar = res.charAt(i);
			}
		}
		System.out.println("Min Occure char is: " + minChar);
		
	}
	public static String remDup(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(! res.contains(ch+"")) {
				res=res+ch;
			}
		}return res;
	}
}
