package mock_test;

public class Execution {
	public static void main(String[] args) {

		Swiggy swiggy1= SwiggyManager.createAccount("Main","anil", 98765456L,"knaveen@gmail.com");

		BankAccount account1=new BankAccount("naveen",852299L, 2000.0);
		swiggy1.order("chickenBiryani", 3, account1);
		account1.checkBal();

		Swiggy swiggy2= SwiggyManager.createAccount("Instamart", "kiran", 98765456L, "mailto:kiran@gmail.com");
		swiggy2.order("dairyMilk", 20, account1);
	}
}