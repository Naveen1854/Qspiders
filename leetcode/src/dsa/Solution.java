package dsa;

public class Solution {
	public static void main(String[] args) {
		String operations[]={"X++","++X","X--","--X"};
		System.out.println(finalValueAfterOperations(operations));
	}
	public static int finalValueAfterOperations(String[]operations) {
		int res=0;
		for(int i=0;i<operations.length;i++) {
			String temp=operations[i];
			System.out.println(temp);
			if(temp.equals("X++") || temp.equals("++X")) {
				return res=res+1;
			}else {
				return res=res-1;
			}
		}
		return res;
	}
}
