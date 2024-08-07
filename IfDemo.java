import java.util.Scanner;
class IfDemo 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		if(num%2==0){
		System.out.println(num + " Even num");
	}
		System.out.println("Out of If block");
	}
}
