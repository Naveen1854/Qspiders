package dsa;

public class DefangIpAddress {
	public static String defangIPaddr(String address) {
		String res="";
		for(int i =0 ;i<address.length();i++){
			char ch = address.charAt(i);
			if(ch=='.'){
				res=res+"[.]";
			}else{
				res=res+ch;
			}
//			if(address.charAt(i) != '.') {
//				res = res+address.charAt(i);
//			}else {
//				res = res+"[.]";
//			}	
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
	}
}
