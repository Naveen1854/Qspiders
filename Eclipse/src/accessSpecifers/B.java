//Different class same package

package accessSpecifers;
public class B {
public static void main(String[] args) {
	System.out.println(A.a);
	
//	B o = new B();
	
//	we can't access protected,default, private variables
//	System.out.println(o.b);
//	System.out.println(o.c);
//	System.out.println(o.d);
	
	A.m1();
//	o.m2();
//	o.m3();
//	o.m4();
	
	}
}
