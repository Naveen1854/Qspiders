class Student
{
	int a;
	int b;
	int c = 54;
	String name;
	float f;
	char ch;
	public static void main(String[] args)
	{
		Student s = new Student();
		 s.display();
		 System.out.println(s.b=60);
		 System.out.println(s.name="Naveen");
		 System.out.println(s.f=5400);
		 System.out.println(s.ch='N');
	}
	Student(){
		a = 50;
		System.out.println(a);
		 }
		void display(){
			System.out.println(c);
	}
}
