package dsa;

public class JewelsStones {
	static int res = 0;
	public static void main(String[] args) {
		System.out.println(foundjewlsInStones("aAAbabAbb","aA"));
	}
	public static int foundjewlsInStones(String stones,String jewels) {
		for(int i=0;i<stones.length();i++) {
			char ch = stones.charAt(i);
//			System.out.println(i);
			boolean found = false;
			for(int j=0;j<jewels.length();j++) {
				char dia = jewels.charAt(j);
//				System.out.println(i+ " " +j);
				if(dia == ch) {
					found = true;
					break;
				}
			}
			if(found) {
				res = res + 1;
			}
		}
		return res;
	}
}
