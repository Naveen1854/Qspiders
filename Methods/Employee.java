class Employee
{
	String name = "Naveen";
	int id = 54;
	double sal = 5000.0;
	char gender = 'M';
	static String companyName = "TCS";
	double salr = 7000.0;
public void selfintro(){
	System.out.println(name);
	System.out.println(id);
	System.out.println(sal);
	System.out.println(gender);
	System.out.println(companyName);
	//System.out.println(salary);
}
	public static void main(String[] args) {
		//new Employee().selfintro();
		Employee e = new Employee();
		e.selfintro();
	}
}
