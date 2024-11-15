package encapsulation;

public class Transaction {
	public static void deposit(double amt,Account a1) {
//		double d = a1.getBal()+amt;
//		a1.setBal(d);
//		(or)
		a1.setBal(a1.getBal()+amt);
		System.out.println(a1.getBal());
	}
	
	public static void withdraw(double amt, Account a1) {
		if(a1.getBal() >= amt) {
			a1.setBal(a1.getBal()-amt);
				System.out.println(a1.getBal());
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public static void checkBal(Account a1) {
		System.out.println(a1.getBal());
	}
}
