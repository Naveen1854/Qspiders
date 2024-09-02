class Student 
{
	int id;
	String name;
	String address;
}
class TestStudent{
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		//System.out.println(s.id);
		//System.out.println(s.name);
		s1.id=54;
		s1.name="Naveen";
		s2.id=102;
		s2.name="Nithin";
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s2.id);
		System.out.println(s2.name);
	}
}
