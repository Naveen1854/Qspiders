public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount("Naveen",852299,1000.0);
		ba.details();
		ba.deposit(500);
		ba.withdraw(300);
	}

}
