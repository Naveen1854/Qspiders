package compare;

public class Comparing {

	public static void main(String[] args) {
		int int1 = 2;
		int int2 = 2;
		String str1 = new String("hello");
		String str2 = new String("hello");

		//when comparing primitive datatypes use double equals to:
		if(int1 == int2) {
			System.out.println("the numbers are equal");
		}else {
			System.out.println("the numbers are not equal");
		}
		
		//when comparing strings use .equals method:
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
	}
}
