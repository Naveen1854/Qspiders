//java program to find sum of all even numbers b/w 1 to n...
import java.util.Scanner;
class  WhileLoop4
{
	public static void main(String[] args) 
	{
		int start = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number till you want even number sum: ");
		int end = sc.nextInt();
		while(start <= end){
			if(start % 2 == 0){
				sum = sum + start;
			}
				start++;
			}
			System.out.println("Sum of all Even numbers is:1 "+sum);
			sc.close();
		}
}
