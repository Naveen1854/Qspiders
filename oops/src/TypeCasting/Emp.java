package TypeCasting;

public class Emp {
	String name;
	int id;
	double sal;
	
	public Emp(String name,int id, double sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	void details() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Salary: " + sal);
	}
}
