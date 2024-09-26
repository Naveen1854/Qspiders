package instanceOf;

class A {
	int age = 24;
}

class B extends A {
	double sal = 45000.0;
}

class C extends A{
	long mobNo = 8522991195L;
}

public class InstanceOfExample {
	public static void main(String[] args) {
//		A a1 = new B();
//		A a2 = new C();
//		
//		if(a1 instanceof B) {
//			System.out.println("a1 is instanceof B"); // true
//		}
//		
//		if(a2 instanceof C) {
//			System.out.println("a2 is instanceof C"); // true
//		}
//		
//		if(a instanceof A) {
//			System.out.println("a is instanceof A"); // true
//		}
//		
//		if(a instanceof B) {
//			System.out.println("a is not instanceof B"); // false
//		}
//		
//		if(a instanceof C) {
//			System.out.println("a is not instanceof C"); // false
//		}
		A  a = new A();
		System.out.println(a instanceof A); //true 
		System.out.println(a instanceof B); //false
		System.out.println(a instanceof C); //false
		
		System.out.println("----------------");
		
		B b1 = new B();
		System.out.println(b1 instanceof B); //true
		System.out.println(b1 instanceof A); //true
//		System.out.println(b1 instanceof C); no relation b/w B and C
		
		System.out.println("----------------");
		
		C c1 = new C();
		System.out.println(c1 instanceof C); //true
		System.out.println(c1 instanceof A); //true
//		System.out.println(c1 instanceof B); no relation b/w c and B
		
		System.out.println("----------------");
		
		A a1 = new B();
		System.out.println(a1 instanceof A); //true
		System.out.println(a1 instanceof B); //true
		System.out.println(a1 instanceof C); //false
	}
}
