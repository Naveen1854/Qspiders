package encapsulation;

public class Account {
	private String un;
	private long accNo;
	private double bal;
	public Account(String un, long accNo, double bal) {
		super();
		this.un = un;
		this.accNo = accNo;
		this.bal = bal;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
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
