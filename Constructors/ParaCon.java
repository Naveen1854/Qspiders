class  ParaCon
{
	int rollno;
	String name;
	String branch;
	public	ParaCon(int a, String n){
		rollno = a;
		name = n;
		System.out.println("1st Constructor");
		System.out.println("Name: " + name + " Rollno: " + rollno);
	}
	ParaCon(String b){
		branch = b;
		System.out.println("2nd Constructor");
		System.out.println("Branch: "+ branch);
	}
	ParaCon(int a, String n, String b){
		rollno = a;
		name = n;
		branch = b;
		System.out.println("3rd Constructor");
		System.out.println("Name: " + name + " Rollno: " + rollno + " Branch: "+ branch);
	}
	public static void main(String[] args)
	{
		new ParaCon(54,"Naveen");
		new ParaCon("CSE");
		new ParaCon(54,"Naveen","CSE");
	}
}
