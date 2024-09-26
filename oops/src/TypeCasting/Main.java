package TypeCasting;

public class Main {
	public static void main(String[] args) {
		Cat mycat = new Cat("Whiskers");
		Owner owner = new Owner();
		owner.callCat(mycat);
	}
}
