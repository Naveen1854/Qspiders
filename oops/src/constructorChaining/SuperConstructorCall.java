package constructorChaining;

class School{
	String name;			// name,id are non-static variable
	int id;					
	static String schoolName = "Telangana School";	// schoolName,schoolAdr are static variables
	static String schoolAdr = "Hyderabad";
	
	public School(String name,int id) {		// constructor
		this.name=name;
		this.id=id;
	}
}

class Teachers extends School{					// sub class extends super class
	double salary;
	public Teachers(String name,int id,double salary){  // constructor
		super(name,id);									// super call, calling super class constructor
		this.salary=salary;
	}
	
	public void display() {								// method to display data members
		System.out.println("Teacher Name: " + name);
		System.out.println("Teacher Id: " + id);
		System.out.println("School Name: " + schoolName);
		System.out.println("School Address: " + schoolAdr);
		System.out.println("Salary: " + salary);
	}
}
class Student extends School{
	double fees;
	Student(String name,int id,double fees){		// constructor
		super(name,id);								// super call, calling super class constructor
		this.fees=fees;
	}
	
	public void display() {								// method
		System.out.println("Student Name: " + name);
		System.out.println("Student Id: " + id);
		System.out.println("School Name: " + schoolName);
		System.out.println("School Address: " + schoolAdr);
		System.out.println("Fees: " + fees);
	}
}

public class SuperConstructorCall {						// Driver class
public static void main(String[] args) {
	Teachers teacher = new Teachers("Hasnan",24,50000.0); 	// object created to call Teacher class constructor 
	System.out.println("Teacher Details:");
	System.out.println("------------------");
	teacher.display();										// method calling
	System.out.println("==================");
	System.out.println("Student Details:");
	System.out.println("------------------");
	Student student = new Student("Naveen",54,10000.0);		// object created to call Student class constructor
	student.display();										// method calling
	System.out.println("==================");
	}
}
