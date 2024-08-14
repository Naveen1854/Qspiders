import java.util.Scanner;
class IfDemo3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character:");
		char c  = sc.next().charAt(0);
		if(c>=65 && c<=90){
		System.out.println(c + " is UpperCase");
	}else{
				System.out.println(c + " is Not UpperCase");
		}
	}
}
