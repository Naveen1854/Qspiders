package mocktest;

public class Invalid extends MakeMyTrip {

	public Invalid(String un, long mobNo, String email) {
		super(un, mobNo, email);
		
	}

	@Override
	public void bookTicket(String place, int numberOfTickets, BankAccount b1) {
		System.out.println("Invalid");	
	}	
}
