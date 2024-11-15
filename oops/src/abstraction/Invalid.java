package abstraction;

public class Invalid implements Calculator {
	@Override
	public void operation(int a, int b) {
		System.out.println("Invalid Operation");
	}
}
