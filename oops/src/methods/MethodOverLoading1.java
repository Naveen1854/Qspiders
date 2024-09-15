package methods;

//Method OverLoading changing no.of arguments
public class MethodOverLoading1 {
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		add(2,3);
		add(1,3,6);

	}

}
