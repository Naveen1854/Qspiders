class Demo
{
	String name;
	int id;
	double salary;
	char gender;
	static String companyName = "TCS";
	//public Demo(){

	//}
	public void selfIntro(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(gender);
		System.out.println(companyName);
	}
}
class Main
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		d1.name="Naveen";
		d1.id=54;
		d1.salary=5000.0;
		d1.gender='M';
		//d1.salary = 70000.0;
		d1.companyName="Wipro";
		d1.selfIntro();

		Demo d2 = new Demo();
		d2.name="Akshay";
		d2.id=45;
		d2.salary=6000.0;
		d2.gender='M';
		//d2.companyName="Wipro";
		d2.selfIntro();
	}
}
