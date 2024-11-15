package mocktest;

public class Bus extends MakeMyTrip{
	private static int hydToBan =  50;
	private static int banToHyd = 30;
	private static int hydToMysore = 10;


	public Bus(String un, long mobNo, String email) {
		super(un, mobNo, email);

	}

	public static int getHydToBan() {
		return hydToBan;
	}

	public static void setHydToBan(int hydToBan) {
		Bus.hydToBan = hydToBan;
	}

	public static int getBanToHyd() {
		return banToHyd;
	}

	public static void setBanToHyd(int banToHyd) {
		Bus.banToHyd = banToHyd;
	}

	public static int getHydToMysore() {
		return hydToMysore;
	}

	public static void setHydToMysore(int hydToMysore) {
		Bus.hydToMysore = hydToMysore;
	}

	@Override
	public void bookTicket(String place, int numberOfTickets, BankAccount b1) {
		if(place == "hydToBan") 
		{
			if(hydToBan >= numberOfTickets) 
			{
				if(b1.bal >= numberOfTickets * 100) 
				{
					hydToBan = hydToBan - numberOfTickets;
					b1.bal = b1.bal - (hydToBan-numberOfTickets);
					System.out.println(numberOfTickets + " Tickets booked succesfully!... enjoy trip");
				}
				else 
				{
					System.out.println("Insufficient Balance in your account");
				}
			}
			else {
				System.out.println(numberOfTickets + " Tickets unavailable... sorry!");
				System.out.println("Available hydToBan ticket count is: " + hydToBan);
			}
		}

		if(place == "banToHyd") 
		{
			if(banToHyd >= numberOfTickets) 
			{
				if(b1.bal >= numberOfTickets * 500) 
				{
					banToHyd = banToHyd - numberOfTickets;
					b1.bal = b1.bal - (banToHyd-numberOfTickets);
					System.out.println(numberOfTickets + " Tickets booked succesfully!... enjoy trip");
				}
				else 
				{
					System.out.println("Insufficient Balance in your account");
				}
			}
			else {
				System.out.println(numberOfTickets + " Tickets unavailable... sorry!");
				System.out.println("Available banToHyd ticket count is: " + banToHyd);
			}
		}
	}
}
