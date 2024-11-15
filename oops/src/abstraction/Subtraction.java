package abstraction;

public class Subtraction implements Calculator {
	@Override
	public void operation(int a, int b) {
		System.out.println(a-b);
	}
}
