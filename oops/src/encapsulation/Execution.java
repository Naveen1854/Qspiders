package encapsulation;

public class Execution {
	public static void main(String[] args) {
		Account account1 = new Account("abc",852299L,200.0);
		Transaction.deposit(300.0, account1);
		Transaction.withdraw(300, account1);
		Transaction.checkBal(account1);
	}
}
