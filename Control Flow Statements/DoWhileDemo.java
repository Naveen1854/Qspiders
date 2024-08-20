import java.util.Scanner;
class  DoWhileDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int a = sc.nextInt();
		do
		{
			System.out.println(a);
			a++;
		}
		while (a<=9);
		//System.out.println(a);
	}
}
