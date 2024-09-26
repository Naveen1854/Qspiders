package instanceOf;

public class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}

class InstanceOf{
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
//		Check if myDog is instanceOf Dog
		if(myDog instanceof Dog) {
			System.out.println("myDog is a Dog");
		}
		
        // Check if myCat is an instance of Cat
		if(myCat instanceof Cat) {
			System.out.println("myCat is Cat");
		}
		
        // Check if myDog is an instance of Animal
		if(myDog instanceof Animal) {
			System.out.println("myDog is Animal");
		}
		
        // Check if myCat is an instance of Animal
		if(myCat instanceof Animal) {
			System.out.println("myCat is Animal");
		}	
	}
}
