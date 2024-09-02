import java.util.Scanner;
class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		String res = (num%2==0) ? "even" : "odd");
		//System.out.println(res);
	}
}
