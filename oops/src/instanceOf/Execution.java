package instanceOf;

class Human{
	String name;
	int id;
	public Human(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
}

class Student extends Human{
	double fees;
	public Student(String name, int id,double fees) {
		super(name, id);
		this.fees=fees;
	}
	public void studentDetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(fees);
	}
}

class Employee extends Human{
	double sal;
	public Employee(String name, int id, double sal) {
		super(name, id);
		this.sal = sal;
	}
	public void employeeDetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
	}
}

public class Execution {
	public static void printDetails(Human h1) { //upCasting
		if(h1 instanceof Student) {
			Student res1 = (Student)h1; // downCasting
			if(res1.fees > 40000.0) {
				res1.studentDetails();
				System.out.println("-----------------");
			}else {
				System.out.println("fee less than 40000.0");
			}
		}
		else if(h1 instanceof Employee) {
			Employee res2 = (Employee)h1;
			if(res2.sal > 40000.0) {
				res2.employeeDetails();
			}else {
				System.out.println("sal less than 40000.0");
			}
		}
	}
	public static void main(String[] args) {
		Student std1 = new Student("Naveen",54,95000.0);
		Employee emp1 = new Employee("Kiran",19,20000.0);
		printDetails(std1);
		printDetails(emp1);
	}
}
