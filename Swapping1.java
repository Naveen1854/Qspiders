//Swapping using third Variable:
import java.util.Scanner;
class  Swapping1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter Value of b: ");
		int b = sc.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping a = " + a + ", b = "+b);
	}
}