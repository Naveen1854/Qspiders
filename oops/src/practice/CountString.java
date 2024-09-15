package practice;

public class CountString {

	public static void main(String[] args) {
		String str = "Kusuma Naveen";
		int count = 0;
		System.out.println(str.length());
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count ++;
			}
		}
		System.out.println(count);

	}

}
