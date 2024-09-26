package polymorphism;


// Run time polymorphism can be achieved by method overriding
// also called Dynamic method dispatch

class A{
	void m1() {
		System.out.println("Inside A's m1 method");
	}
}

class B extends A{
	@Override
	void m1() {
		System.out.println("Inside B's m1 method");
	}
}

class C extends A{
	@Override
	void m1() {
		System.out.println("Inside C's m1 method");
	}
}

public class Dispatch {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		B b = new B();
		b.m1();
		C c = new C();
		c.m1();
//		A ref;
//		ref = a;
//		ref.m1();
//		ref = b;
//		ref.m1();
//		ref = c;
//		c.m1();
		

	}

}
