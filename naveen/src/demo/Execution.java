package demo;

class A {
	public void m1() {
		System.out.println("sql");
	}
}
	class B extends A{
		@Override
		public void m1() {
			System.out.println("java");
		}
	}
	public class Execution{
		public static void main(String[] args) {
			A a1 = new B();
			a1.m1();
	}
}
