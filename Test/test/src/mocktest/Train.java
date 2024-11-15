package mocktest;

public class Train extends MakeMyTrip{
	private static int hydToMumbai = 300;
	private static int munbaiToBan = 400;

	public Train(String un, long mobNo, String email) {
		super(un, mobNo, email);

	}

	public static int getHydToMumbai() {
		return hydToMumbai;
	}

	public static void setHydToMumbai(int hydToMumbai) {
		Train.hydToMumbai = hydToMumbai;
	}

	public static int getMunbaiToBan() {
		return munbaiToBan;
	}

	public static void setMunbaiToBan(int munbaiToBan) {
		Train.munbaiToBan = munbaiToBan;
	}

	@Override
	public void bookTicket(String place, int numberOfTickets, BankAccount b1) {
		if(place == "hydToMumbai") 
		{
			if(hydToMumbai >= numberOfTickets) 
			{
				if(b1.bal >= numberOfTickets * 1000) 
				{
					hydToMumbai = hydToMumbai - numberOfTickets;
					b1.bal = b1.bal - (hydToMumbai-numberOfTickets);
					System.out.println(numberOfTickets + "Tickets booked succesfully!... enjoy trip");
				}
				else 
				{
					System.out.println("Insufficient Balance in your account");
				}
			}
			else {
				System.out.println(numberOfTickets + " Tickets unavailable... sorry!");
				System.out.println("Available hydToMumbai ticket count is: " + hydToMumbai);
			}
		}
		if(place == "munbaiToBan") 
		{
			if(munbaiToBan >= numberOfTickets) 
			{
				if(b1.bal >= numberOfTickets * 1000) 
				{
					munbaiToBan = munbaiToBan - numberOfTickets;
					b1.bal = b1.bal - (munbaiToBan-numberOfTickets);
					System.out.println(numberOfTickets + " Tickets booked succesfully!... enjoy trip");
				}
				else 
				{
					System.out.println("Insufficient Balance in your account");
				}
			}
			else {
				System.out.println(numberOfTickets + " Tickets unavailable... sorry!");
				System.out.println("Available munbaiToBan ticket count is: " + munbaiToBan);
			}
		}
	}
}
