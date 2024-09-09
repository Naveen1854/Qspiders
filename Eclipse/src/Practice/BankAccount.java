package Practice;

public class BankAccount {
	String name;
	long accNo;
	double bal;
	static String companyName = "TCS";
	
	public BankAccount(String name,long accNo,double bal) {
	this.name=name;
	this.accNo=accNo;
	this.bal=bal;
	}
	void details() {
		System.out.println(name);
		System.out.println(accNo);
		System.out.println(bal);
		System.out.println(companyName);
	}
	
	void credit(double amt) {
		bal = bal+amt;
		System.out.println(bal);
	}
}
