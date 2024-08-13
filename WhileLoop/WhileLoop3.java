//java program to print all odd numbers b/w 2 numbers using while loop...
import java.util.Scanner;
class  WhileLoop3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int start = sc.nextInt();
		System.out.println("Enter second Number: ");
		int end = sc.nextInt();
		System.out.println("Odd numbers b/w "+start+ " and "+ end);
		while(start<=end){
			if(start % 2 != 0){
			System.out.println(start);
			}
			start ++;
		}
		sc.close();
	}
}
