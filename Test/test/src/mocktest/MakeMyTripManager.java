package mocktest;

public class MakeMyTripManager {
	public static MakeMyTrip createAccount(String un,long mobNo,String email,String vehicle) {
		if(vehicle == "Bus") {
			MakeMyTrip mt1 = new Bus(un, mobNo, email);
			return mt1;
		}
		else if(vehicle == "Train") {
			MakeMyTrip mt2 = new Train(un,mobNo,email);
			return mt2;
		}
		else if(vehicle == "Auto") {
			MakeMyTrip mt3 = new Invalid(un, mobNo, email);
			return mt3;

		}else {
			return null;
		}
	}

}
