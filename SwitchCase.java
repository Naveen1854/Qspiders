import java.util.Scanner;
class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Course Name:");
		String input = sc.nextLine();
		switch (input)
		{
		case "javaFullStack": System.out.println("Core Java");
									System.out.println("Advance Java");
									System.out.println("Web Technology");
									System.out.println("Sql");
		break;
		case "pythonFullStack": System.out.println("Core Python");
										System.out.println("Advance Python");
										System.out.println("Web Technology");
										System.out.println("Sql");
		break;
		case "testing": System.out.println("Core Java");
							System.out.println("Java Automation");
							System.out.println("Manual Testing");
							System.out.println("Sql");
		break;
		default : System.out.println("No Such course Available");
			System.out.println("Other Available Courses are:  AWS, PBI, AZURE, DATA ANALYST.");
		}
	}
}
