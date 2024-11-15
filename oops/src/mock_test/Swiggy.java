package mock_test;

public abstract class Swiggy {
	private String name;
	private long mobNo;
	private String email;
	public Swiggy(String name, long mobNo, String email) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public abstract void order(String item,int count,BankAccount b1);
}
