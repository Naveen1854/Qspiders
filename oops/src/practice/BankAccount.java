package practice;

public class BankAccount {

	public static void main(String[] args) {
		Savings s = new Savings("Naveen",85229911L,40000.0,1.5);
		s.details();
//		System.out.println("After withdrawn: ");
		s.withdraw(1000);
		System.out.println("----------------");
		
		
		Current c = new Current("Tarun",69510521L,10000.0,2.5);
		c.details();
		c.withdraw(4000);
		System.out.println("----------------");
		
		
	}

}
