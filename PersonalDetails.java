import java.util.Scanner;
class  PersonalDetails
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		System.out.println("Enter Your Salary:");
		double sal = sc.nextDouble();
		System.out.println("Enter Your Mob_No:");
		long mob_no = sc.nextLong();
		System.out.println("Enter Your gender:");
		char gender = sc.next().charAt(0);
		System.out.println("Single:");
		boolean single = sc.nextBoolean();
		System.out.println("===================================================================");
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
		System.out.println(mob_no);
		System.out.println(gender);
		System.out.println(single);							
	}
}
