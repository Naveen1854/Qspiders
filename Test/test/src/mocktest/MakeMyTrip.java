package mocktest;

public abstract class MakeMyTrip {
	String un;
	long mobNo;
	String email;
	public MakeMyTrip(String un, long mobNo, String email) {
		super();
		this.un = un;
		this.mobNo = mobNo;
		this.email = email;

	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	// Method
	public abstract void bookTicket(String place, int numberOfTickets, BankAccount b1);
}
