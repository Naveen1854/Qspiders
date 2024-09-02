public class BankAccount {
String name;
long accNo;
double bal;
static String bankName = "SBI";

public BankAccount(String name2, long accNo2, double bal2) {
	// TODO Auto-generated constructor stub
	this.name = name2;
	this.accNo = accNo2;
	this.bal = bal2;
}

public void details() {
	System.out.println(name);
	System.out.println(accNo);
	System.out.println(bal);
	System.out.println(bankName);
}

public void deposit(double amt){
	bal += amt;
	System.out.println("Balance after Deposite: " + bal);
}

public void withdraw(double amt) {
	if(bal >= amt) {
		bal -= amt;
		System.out.println("Balance after withdraw: " + bal);
	}else {
		System.out.println("Insufficent Bal");
	}
}

public void checkBalance(double amt) {
	System.out.println(bal);
	}
}
