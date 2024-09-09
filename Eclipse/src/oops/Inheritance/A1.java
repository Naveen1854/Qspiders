package oops.Inheritance;

//Demonstrate when the constructors are called

public class A1 {
	 A1(){
		System.out.println("Inside A's constructor");
	}
}
class B1 extends A1{
	B1() {
		System.out.println("Inside B's constructor");
	}
}
class C1 extends B1{
	C1(){
		System.out.println("Inside C's constructor");
	}
}
class CallingCons{
	public static void main(String[] args) {
		C1 c = new C1();
	}
}
