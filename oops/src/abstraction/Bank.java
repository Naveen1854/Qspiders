package abstraction;

public abstract class  Bank {
	String un;
	long accNo;
	double bal;
	public Bank(String un, long accNo, double bal) {
//		super();
		this.un = un;
		this.accNo = accNo;
		this.bal = bal;
	}
	public abstract void deposit(double amt);
	
	public abstract void withdraw(double amt);
	
	public abstract void checkBalance(); 
//		System.out.println("Current balance: " + bal);
	
}
