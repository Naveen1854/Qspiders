// If a class have an Entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship

class Address{
	String city;
	String state;
	String country;
	
	public Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Employee{
	int id;
	String name;
	Address address;
	
	public Employee(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void display() {
		System.out.println("Id: " + id+" "+"Name: " + name);
		System.out.println("City: " + address.city+" "+"State: " + address.state+" "+"Country: " + address.country);
	}
}
public class Has_a_Relationship {
	public static void main(String[] args) {
		Address address1 = new Address("Narsampet","Telangana","India");
		Employee e1 = new Employee(101,"Naveen",address1);
		
		e1.display();
	}
}
