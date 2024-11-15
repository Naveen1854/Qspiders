package abstraction;

public class CurrentAccount extends Bank {
	public CurrentAccount(String un, long accNo, double bal) {
		super(un, accNo, bal);
	}
	@Override
	public void deposit(double amt) {
		if (amt > 0) {
			bal += amt;
			System.out.println("Deposit successful. " + amt + " has been added to your account.");
			checkBalance();
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	@Override
	public void withdraw(double amt) {
		if (amt > 0 && amt <= bal) {
			bal -= amt;
			System.out.println("Withdrawal successful. " + amt + " has been withdrawn from your account.");
		} else if (amt > bal) {
			System.out.println("Insufficient balance. Withdrawal failed.");
		} else {
			System.out.println("Withdrawal amount must be positive.");
			checkBalance();
		}
	}
	@Override
	public void checkBalance() {
		System.out.println(bal);
	}
}
