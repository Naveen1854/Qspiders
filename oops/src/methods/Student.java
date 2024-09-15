package methods;

public class Student {
int rollNo;
String name;

void insertRecord(int rollNo,String name) {
	this.rollNo=rollNo;
	this.name=name;
}
void display() {
	System.out.println(rollNo+ " " + name);
}
class TestStudent{
	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student();
		s1.rollNo=1;
		s1.name="nawin";
		s1.display();
		s.insertRecord(2, "naveen");
		s1.insertRecord(3, "kiran");
		s.display();
		s1.display();
		
	}
}
}
