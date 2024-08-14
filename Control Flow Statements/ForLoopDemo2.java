import java.util.Scanner;
class ForLoopDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++){
		System.out.println("Enter 1st Num:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Num:");
		int b = sc.nextInt();
		int res = a+b;
		System.out.println("Addition of " +a+ " and "+b+ " is: "+ res);
		}
	}
}
