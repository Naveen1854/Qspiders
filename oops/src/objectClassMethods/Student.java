package objectClassMethods;

public class Student {
	String name;
	int rollno;
	String city;
	long mobNo;
	//	String name1 = "Naveen";
	//	String name2 = "Kiran";
	public Student(String name, int rollno, String city, long mobNo) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.city = city;
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "[Name: " + name + " rollno: " + rollno + " city: " + city + " mobNo: " + mobNo +"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		// Cast the object to a Student and compare the attributes
		Student student = (Student) obj;
		return this.name.equals(student.name) && 
				this.rollno == student.rollno;
	}
}
