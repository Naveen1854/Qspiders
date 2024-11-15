package mock_test;

public class BankAccount {
	String name;
	long accNo;
	double bal;
	public BankAccount(String name, long accNo, double bal) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.bal = bal;
	}
	public void deposit(double amt) {
		if (amt > 0) {
			bal += amt;
			System.out.println("Successfully deposited: " + amt);
		} else {
			System.out.println("Deposit amount must be greater than zero.");
		}
	}
	public void withdraw(double amt) {
		if (amt > 0 && amt <= bal) {
			bal -= amt;
			System.out.println("Successfully withdrawn: " + amt);
		} else if (amt > bal) {
			System.out.println("Insufficient funds for withdrawal.");
		} else {
			System.out.println("Withdrawal amount must be greater than zero.");
		}
	}
	public void checkBal() {
		System.out.println("Available " + bal);
	}
}
