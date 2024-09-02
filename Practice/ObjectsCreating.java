class ObjectsCreating 
{
	int rollno;
	String name;
	void insertrecord(int r,String n){
		rollno=r;
		name=n;
	}
	void displayInformation(){
		System.out.println(rollno + " " + name);
	}
}
	class TestStudents{
	public static void main(String[] args) {
		ObjectsCreating oc1 = new ObjectsCreating();
		ObjectsCreating oc2 = new ObjectsCreating();
		oc1.insertrecord(54,"Naveen");
		oc2.insertrecord(19,"Nithin");
		oc1.displayInformation();
		oc2.displayInformation();
	}
}
