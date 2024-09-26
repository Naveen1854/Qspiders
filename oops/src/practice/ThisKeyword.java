package practice;

class Student{
	String name;
	int rollNo;
	String clgName;
	double fees;
	String dist;
	
	public Student(String name,int rollNo,String clgName,double fees) {
		this.name=name;
		this.rollNo=rollNo;
		this.clgName=clgName;
		this.fees=fees;
	}
	public Student(String name,int rollNo,String clgName,double fees,String dist) {
//		this.name=name;
//		this.rollNo=rollNo;
//		this.clgName=clgName;
//		this.fees=fees;
		this(name,rollNo,clgName,fees);
		this.dist=dist;
	}
	void details() {
		System.out.println("Name: " + name);
		System.out.println("RollNo: " + rollNo);
		System.out.println("College Name: " + clgName);
		System.out.println("Fees: " + fees);
		System.out.println("Distrit:" + dist);
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		Student s = new Student("Naveen",54,"SR University",5000.0,"Warangal");
		s.details();
	}

}
