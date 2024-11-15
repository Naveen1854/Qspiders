package mocktest;

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
}
