package arrayList;

public class Student implements Comparable<Student>{
	String name;
	int id;
	double fee;
	public Student(String name, int id, double fee) {
		super();
		this.name = name;
		this.id = id;
		this.fee = fee;
	}
	@Override
	public int compareTo(Student stu) {
		return (int) (this.fee-stu.fee);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", fee=" + fee + "]";
	}
	
}
