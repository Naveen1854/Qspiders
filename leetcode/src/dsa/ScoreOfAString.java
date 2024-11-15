package dsa;

public class ScoreOfAString {

	public static int stringScore(String s) {
		int res = 0;
		for(int i=0;i<s.length()-1;i++) {
			int a = i;
			int b = i+1;
			int aascii = s.charAt(a);
			int bascii = s.charAt(b);
			int temp = Math.abs(aascii - bascii);	
			res = res + temp;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(stringScore("NAVEEN"));
	}
}
