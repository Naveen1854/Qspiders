import java.util.Scanner;
class Addittion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int fstNum = sc.nextInt();
		System.out.println("Enter Second Number:");
		int secNum = sc.nextInt();
		int res = fstNum+secNum;
		System.out.println("Addition of  "+fstNum+" and " +secNum+ " is " + res);
	}
}