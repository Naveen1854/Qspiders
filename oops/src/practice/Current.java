package practice;

public class Current extends Account {
	double roiOfCurrent;
	public Current(String un, long accNo, double bal, double roiOfCurrent) {
	super(un, accNo, bal);
	this.roiOfCurrent=roiOfCurrent;
}
	
	@Override
	public void withdraw(double amt) {
		if(bal-amt>=5000.0) {
			bal -= amt;
			CheckBalance();
		}else {
			System.out.println("InSufficient balance");
		}
	}
		
		 @Override
			public void details() {
				super.details();
				System.out.println("ROI Of Current Account: " + roiOfCurrent);
				}
}
