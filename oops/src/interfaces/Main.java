package interfaces;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
	@Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
	@Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Woof

        Animal myCat = new Cat();
        myCat.makeSound();  // Output: Meow
    }
}
