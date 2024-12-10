package demo;


class Student{
	String un;
	int id;
	double fees;
	public Student(String un,int id,double fees) {
		this.un=un;
		this.id=id;
		this.fees=fees;
	}
	@Override
	public String toString() {
		return "Student [un=" + un + ", id=" + id + ", fees=" + fees + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student res1 = (Student)o;
			return this.id == res1.id;
		}
		else if(o instanceof Employee1) {
			Employee1 res2 = (Employee1)o;
			return this.id == res2.id;
		}
		else {
			return false;
		}
	}
}
class Employee1{
	String un;
	int id;
	double sal;
	public Employee1(String un,int id,double sal) {
		this.un=un;
		this.id=id;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Employee1 [un=" + un + ", id=" + id + ", sal=" + sal + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student res1 = (Student)o;
			return this.id == res1.id;
		}
		else if(o instanceof Employee1) {
			Employee1 res2 = (Employee1)o;
			return this.id == res2.id;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return id;
	}
}

public class ComEmpStu {
	public static void main(String[] args) {
		Student s1 = new Student("Naveen",122,45000.0);
		Employee1 e1 = new Employee1("Kiran",122,50000.0);
		System.out.println(e1.equals(s1));
		System.out.println(e1.hashCode() == s1.hashCode());
	}
}
