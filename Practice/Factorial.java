import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int a = sc.nextInt();
		for(int i = 1;i<=a;i++){
		fact  *= i;
		}
	System.out.println("Factorial of Given Number is: "+fact);
	}
}
