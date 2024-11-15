package demo;

public class EmployeeDriver {
	public static void printDetails(Employee e) {
		System.out.println(e);
		System.out.println("Name: " + e.name);
		System.out.println("Id: " + e.id);
		System.out.println("sal: " + e.sal);
	}
	public static void main(String[] args) {
		Employee e1=new Employee("naveen", 101, 50000);
		printDetails(e1);
		Employee.emp("Hyderabad");
		Employee e2 = new Employee("Kiran",102, 65000);
		printDetails(e2);
		Employee.emp("Warangal");
	}
}
