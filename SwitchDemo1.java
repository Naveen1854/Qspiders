import java.util.Scanner;
class SwitchDemo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int a = sc.nextInt();
		switch(a%2){
			case 0: System.out.println("Even");
			break;
			case 1:System.out.println("Odd");
		}
	}
}
