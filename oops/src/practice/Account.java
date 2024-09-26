package practice;

public class Account {
String un;
long accNo;
double bal;
public Account(String un, long accNo, double bal) {
//	super();
	this.un = un;
	this.accNo = accNo;
	this.bal = bal;
}

public void deposit(double amt) {
	bal += amt;
	System.out.println(bal);
}

public void withdraw(double amt) {
	System.out.println("Not yet Overrided");
}

public void CheckBalance() {
	System.out.println("After withdrawn: " + bal);
}
public void details() {
	System.out.println("User Name: " + un);
	System.out.println("Account No: " + accNo);
	System.out.println("Available Balance: " + bal);
	}
}
