//java program to print even numbers between 2 numbers using while loop...
import java.util.Scanner;
class  WhileLoop2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number: ");
		int start = sc.nextInt();
		System.out.println("Enter end number: ");
		int end = sc.nextInt();
		System.out.println("Even numbers b/w "+start+ " and " + end);
		while (start <= end)
		{
			if(start % 2 == 0){
				System.out.println(start);
			}
			start++;
		}
	}
}
