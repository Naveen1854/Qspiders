import java.util.Scanner;
class  ScannerDemo1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int a = s.nextInt();
		System.out.println("Your input is "+a);
	}
}
