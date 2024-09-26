package practice;


class C{
	void m1() {
		System.out.println("parent method");
	}
}
	class D extends C{
		@Override
		void m1() {
			System.out.println("child1 Method");
	}
}
		class E extends D{
			@Override
			void m1() {
				System.out.println("chile2 Method");
		}
	}
public class MethodOverriding {

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		D d = new D();
		d.m1();
		E e = new E();
		e.m1();
		

	}

}
