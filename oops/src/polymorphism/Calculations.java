package polymorphism;

//compile time polymorphism:
//can be achieved by using method Overloading:
public class Calculations {
	public void add(int a, int b) { //method 1
		System.out.println(a+b);
	}										//different parameters
	public void add(int a, String name) { // method 2
		System.out.println(a+name);
	}
	public static void main(String[] args) {
		Calculations c = new Calculations();
		c.add(5, 5);
		c.add(54, " naveenn");
	}
}

// best examples for method overloading are
//print and println methods
