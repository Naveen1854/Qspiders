package strings;

public class MinOccOfChar {
	public static void main(String[] args) {
		String str = "java programming";
		String res = remDup(str);
		//		System.out.println(res)
		char minChar=' ';
		int minCount = str.length();

		for(int i=0;i<res.length();i++) {
			int count = 0;
			for(int j=0;j<str.length();j++) {
				if(res.charAt(i)==str.charAt(j)) {
					count ++;
				}
			}
			if(count < minCount) {
				minCount  = count;
				minChar = res.charAt(i);
			}
		}
		System.out.println("Min Occ char is: " + minChar);
	}
	public static String remDup(String str) {
		String res = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!res.contains(ch+"")) {
				res+=ch;
			}
		}
		return res;
	}
}
