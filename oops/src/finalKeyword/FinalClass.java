package finalKeyword;

final class FinalClass {
	public void show() {
		System.out.println("This is a final class.");
	}
}
//Attempting to extend FinalClass would cause a compile-time error
//class SubClass extends FinalClass {
//}

class FinalClassExample{
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.show();
	}
}
