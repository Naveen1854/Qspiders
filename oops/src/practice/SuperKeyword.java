package practice;

class A{
	int a;
	double d;
	String s;
	char c;
	public A(int a,double d,String s,char c) {
		this.a=a;
		this.d=d;
		this.s=s;
		this.c=c;
	}
}
	class B extends A{
		float f;
		public B(int a,double d,String s,char c,float f) {
			super(a, d, s, c);
			this.f=f;
	}
		public void display() {
			System.out.println(a);
			System.out.println(d);
			System.out.println(s);
			System.out.println(c);
			System.out.println(f);
		}
}

public class SuperKeyword {
	public static void main(String[] args) {
		B b = new B(54,54.5,"nawin",'N',54F);
		b.display();
	}

}
