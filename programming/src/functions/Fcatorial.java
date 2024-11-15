package functions;

public class Fcatorial {
	public static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		return num*factorial(num-1);//recursive call
	}
	public static void main(String[] args) {
		int res = factorial(5);
		System.out.println(res);
	}
}
