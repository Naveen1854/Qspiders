class  AgeWeight
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your Age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Enter your Weight:");
		double weight = sc.nextDouble();
        if (age >= 18) {
            if (weight >= 50.0) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You must weigh at least 50 kilograms to donate blood.");
            }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
        }
    }
}
