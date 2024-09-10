package oopsPrinciples;

public class Inheritance {
public static void main(String[] args) {
	Employee e = new Employee();
	e.emp(1000);
	Programmer p = new Programmer();
	p.emp(1000);
	p.emp(1000, 500);
}
}