package finalKeyword;

class ParentClass{
	public final void display() {
		System.out.println("This is a final method:");
	}
}
class ChildClass extends ParentClass{
	// Attempting to override the final method would cause a compile-time error
    // public void display() {
    //     System.out.println("Trying to override.");
    //
}

public class FinalMethodExample {
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.display();
		ChildClass cc = new ChildClass();
		cc.display();
	}

}
