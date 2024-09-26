package constructors;

public class Person {
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	public static void main(String[] args) {
		Person p = new Person("Naveen",24);
		p.displayInfo();
	}
}
