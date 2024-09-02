//passing object as a parameter to a method...

class  Student2
{
	int rollno = 101;
	double marks = 93.5;
	String name = "Naveen";
}

class ObjectDemo
{
	public static void main(String[] args)
	{
		Student2 s1 = new Student2();
		ObjectDemo od = new ObjectDemo();
		od.display(s1);
	}

	void display(Student2 s2){
		System.out.println("Student name is: "+ s2.name);
		System.out.println("Rollno is: "+ s2.rollno);
		System.out.println("Student marks is: "+ s2.marks);
	}
}
