package oopsPrinciples;

public class Calculator1 {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
class Calculator2 extends Calculator1{
	public void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}
}
class SngleInheritance{
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.add(10,20);
		Calculator2 c2 = new Calculator2();
		c2.add(10,20,20);
	}
}