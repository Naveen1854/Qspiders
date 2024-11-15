package demo;

public class Employee {
	String name;
	int id;
	double sal;
	public Employee(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public static void emp(String address) {
		System.out.println("Address: " + address);
		System.out.println("-------------------");
	}
}
