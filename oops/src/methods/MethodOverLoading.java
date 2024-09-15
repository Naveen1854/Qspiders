package methods;

// Method Overloading changing data type of arguments
public class MethodOverLoading {
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double d,double b) {
		return d+b;
	}
	public static void main(String[] args) {
		System.out.println(add(2,3));
		System.err.println(add(2.5,2.5));
	}
}
