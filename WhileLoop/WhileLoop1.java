//Java program to print natural numbers 1 to n using while loop...
import java.util.Scanner;
class  WhileLoop1
{
	public static void main(String[] args) 
	{
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value till the natural numbers to be printed: ");
		int a = sc.nextInt();
		System.out.println("Natural Numbers till " +a+ " are :");
		while(i<=a){
			System.out.println(i);
			i++;
		}
		sc.close();
	}
}
