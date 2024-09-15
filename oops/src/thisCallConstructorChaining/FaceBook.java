package thisCallConstructorChaining;

class FaceBook {
String name;
long mobNo;
int age;
String email;
char gender;
String pass;

//constructor1
public FaceBook(String name,long mobNo,int age,String email) {
	this.name=name;
	this.mobNo=mobNo;
	this.age=age;
	this.email=email;
}

//constructor2
public FaceBook(String name,long mobNo,int age,String email,char gender) {
	this(name,mobNo,age,email);
	this.gender=gender;
}

//constructor3
public FaceBook(String name,long mobNo,int age,String email,char gender,String pass) {
	this(name,mobNo,age,email,gender);
	this.pass=pass;
}
public void display() {
	System.out.println(name);
	System.out.println(mobNo);
	System.out.println(age);
	System.out.println(email);
	System.out.println(gender);
	System.out.println(pass);
}

//driver class
public class ThisConstructor{
	public static void main(String[] args) {
		FaceBook fb = new FaceBook("Naveen",852299L,24,"naveen@gmail.com",'M',"nawin1234");
		fb.display();
		}
	}
}
