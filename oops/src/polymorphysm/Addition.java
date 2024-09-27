package polymorphysm;

public class Addition {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.add(6,2);
		a1.add(2, 4, 3);
		a1.sub(5, 2);
	}
}
