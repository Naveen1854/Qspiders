package abstraction;

public class AccountManager {
	public static Bank createAccount(String type, String un,long accNo,double bal) {
		if(type == "savings") {
			Bank s1 = new SavingsAccount(un, accNo, bal);		//upCasting
			return s1;
		}
		else if(type == "current") {
			Bank c1 = new CurrentAccount(un, accNo, bal);
			return c1; 
		}else {
			Bank i1 = new Invalid2(un, accNo, bal);
			return i1;			
		}
	}
}
