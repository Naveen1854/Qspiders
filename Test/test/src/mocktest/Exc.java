package mocktest;

public class Exc {
	public static void main(String[] args) {
		BankAccount b1  = new BankAccount("Naveen", 8522, 90000.0);
		MakeMyTrip makeTrip1 = MakeMyTripManager.createAccount("Naveen", 852299L, "knaveen@gmail", "Bus");
		makeTrip1.bookTicket("hydToBan", 20, b1);
		makeTrip1.bookTicket("banToHyd", 10, b1);
		makeTrip1.bookTicket("hydToMysore", 5, b1);
		
		MakeMyTrip makeTrip2 = MakeMyTripManager.createAccount("kiran",96189L, "Kiran@gmail", "Train");
		makeTrip2.bookTicket("hydToMumbai", 10, b1);
		makeTrip1.bookTicket("munbaiToBan", 5, b1);
	}
}
