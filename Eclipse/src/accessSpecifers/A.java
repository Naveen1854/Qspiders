// same class same Package

package accessSpecifers;

public class A {
public static int a = 10;
protected int b = 20;
int c = 30;
private static int d = 40;

public static void m1() {
	System.out.println("method-1");
}
protected void m2() {
	System.out.println("method-2");
}
 void m3() {
	 System.out.println("method-3");
}
private static void m4() {
	System.out.println("method-4");
}
public static void main(String[] args) {
	System.out.println(a);
	
	A o = new A();
	System.out.println(o.b);
	System.out.println(o.c);
	System.out.println(d);
	m1();
	o.m2();
	o.m3();
	m4();
	}
}
