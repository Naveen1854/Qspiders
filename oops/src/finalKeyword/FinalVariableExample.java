package finalKeyword;

public class FinalVariableExample {
	public static void main(String[] args) {
		final int a = 54;
	//  a = 50;			// this line would cause a compile-time error.
		System.out.println(a);
	}
}
