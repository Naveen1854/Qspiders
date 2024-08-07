import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		String res = (num%2==0 ? num+" is even " : num + " is Odd ");
		System.out.println(res);
	}
}
				 