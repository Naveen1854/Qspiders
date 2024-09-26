package constructors;

public class Employee {
	String name;
	double sal;
	
	//default constructor
	public Employee() {
		this.name="Unknown";
		this.sal=0;
	} 
	
	//Parameterized constructor
	public Employee(String name,double sal) {
		this.name=name;
		this.sal=sal;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("Name: " + name);
		System.out.println("sal:" + sal);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.displayEmployeeInfo();
		
		Employee e2  = new Employee("Naveen", 50000);
		e2.displayEmployeeInfo();
	}
}
