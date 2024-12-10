package demo;

public class ArithematicException {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			System.out.println(4/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Exception Handled");
		}
		System.out.println("Main Ended");
	}
}
