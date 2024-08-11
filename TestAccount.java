class Account {
	int act_no;
	String name;
	float amount;
	void insert(int a, String n, float amt){
		act_no = a;
		name = n;
		amount = amt;
	}
	void deposit(float amt){
		amount += amt;
		System.out.println(amt+ " deposited");
	}
	void withdraw(float amt){
		if(amount < amt){
			System.out.println("Insufficent Balance");
		}else{
			amount=amount-amt;
			System.out.println(amt + " withdrawn");
		}
	}
	void checkBalance(){
		System.out.println("Balance is: "+ amount);
	}
		void display(){
			System.out.println("Account_no: " + act_no + " \nName: " + name + " \nAmount: "+ amount);
		}
}
		class TestAccount{
			public static void main(String[] args) {
				Account a=new Account();  
				a.insert(832345,"Naveen",1000);  
				a.display();  
				a.checkBalance();  
				a.deposit(40000);  
				a.checkBalance();  
				a.withdraw(15000);  
				a.checkBalance();
	}
}
