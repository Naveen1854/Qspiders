package oops.Inheritance;

//A simple example of Inheritance
public class A {
	 int i, j;

	 void showij() {
		System.out.println("i and j:" + i + " " + j);
	}

}

//create a subclass by extending class A
class B extends A {
	int k;

	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i+j+k: " + (i + j + k));
	}

	public static void main(String[] args) {
		B b = new B();
		b.showij();
		b.showk();
		b.sum();
	}
}
