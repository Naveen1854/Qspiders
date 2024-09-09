package oops.Inheritance;

public class Demo {
	int i;
	int j;
	void setij(int i,int j) {
		this.i=i;
		this.j=j;
	}
}
class Demo1 extends Demo{
	int total;
	void sum() {
		total = i + j;
	}
}
class Access{
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.setij(10, 12);
		d1.sum();
		System.out.println("Total is: "+ d1.total);
	}
}