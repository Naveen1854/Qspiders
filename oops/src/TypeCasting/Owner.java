package TypeCasting;

public class Owner {
	void callCat(Cat cat) {
		System.out.println("calling " + cat.name);
		cat.meow();
	}
}
