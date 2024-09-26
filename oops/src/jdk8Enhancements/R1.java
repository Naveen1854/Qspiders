package jdk8Enhancements;

public interface R1 {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public default void sub(int a, int b) {
		System.out.println(a-b);
	}
	void mul();
}
