package abstraction;

public class Invalid2 extends Bank {

	public Invalid2(String un, long accNo, double bal) {
		super(un, accNo, bal);
	}
	@Override
	public void deposit(double amt) {
		System.out.println("invalid Operation");
	}
	@Override
	public void withdraw(double amt) {
		System.out.println("Invalid operation");
	}
	@Override
	public void checkBalance() {
		System.out.println("Invalid operation");
	}
}
