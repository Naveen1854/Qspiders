import java.util.Scanner;
class  MaxOf4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Four Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(b > a)
			a = b;
		if(c > a)
			a = c;
		if(d > a);
		a = d;
		System.out.println("Max is: " + a);
		sc.close();
	}
}
