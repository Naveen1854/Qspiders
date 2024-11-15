package demo;

/*Factory Method:
 
A method which is creating the object and returning the address in to the caller is known as the factory method */
//https://vpaste.net/YPZM0 link to src code.

public class BookDriver {
	public static Book createObject(String name,String author,double price) {
		
		return new Book(name,author,price);
	}
	public static void main(String[] args) {
		Book b = createObject("Ramayanam", "Valmiki", 1500.0);
		System.out.println("Object Address: " + b);
		System.out.println("Book Name: " + b.name);
		System.out.println("Book Author: " + b.author);
		System.out.println("Price: " + b.price);
		System.out.println("-----------------");
		Book b1 =createObject("Mahabaratham", "Vedavasa", 1000.0);
		System.out.println("Object Address: " + b1);
		System.out.println("Book Name: " + b1.name);
		System.out.println("Book Author: " + b1.author);
		System.out.println("Price: " + b1.price);
	}
}
