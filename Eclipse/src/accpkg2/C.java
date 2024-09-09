// different class different packages

package accpkg2;
import accessSpecifers.A;
public class C {

	public static void main(String[] args) {
		System.out.println(A.a);
		
//		we can't access protected,default, private variables
		
//		C o = new C();
//		System.out.println(o.b);
//		System.out.println(o.c);
//		System.out.println(o.d);
		A.m1();
//		o.m2();
//		o.m3();
//		o.m4();
		
	}

}
