package practice;

public class Savings extends Account {
	 double roiOfSavings; 
	 public Savings(String un, long accNo, double bal, double roiOfSavings) {
		 super(un,accNo,bal);
		 this.roiOfSavings = roiOfSavings;
	 }
	 
	 public void withdraw(double amt) {
		 if(bal >= amt) {
			 bal -= amt;
			 CheckBalance();
		 }else {
			 System.out.println("insufficient Balance");
		 }
	 }
	 
	 @Override
	 public void details() {
		 super.details();
		 System.out.println("ROI Of Savings Account: " + roiOfSavings);
	}
}
