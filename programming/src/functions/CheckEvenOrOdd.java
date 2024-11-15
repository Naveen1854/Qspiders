package functions;

public class CheckEvenOrOdd {
	public static String evenOdd(int num) {
		if(num%2==0) {
			return "even";
		}else{
			return "odd";
		}
	}
	public static void main(String[] args) {
		String res = evenOdd(4);
		System.out.println(res);
	}
}
