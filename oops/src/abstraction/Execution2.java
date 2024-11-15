package abstraction;

public class Execution2 {

	public static void main(String[] args) {
		Bank savings_account = AccountManager.createAccount("savings", "Naveen", 852299L, 500);
		savings_account.deposit(1000);
		savings_account.withdraw(200);
		savings_account.checkBalance();

		Bank current_account = AccountManager.createAccount("current", "kiran", 2299L, 500);
		current_account.deposit(100);
		current_account.withdraw(20);
		current_account.checkBalance();

	}
}
