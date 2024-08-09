import java.util.Scanner;
class MaxMin 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Num:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Num:");
		int b = sc.nextInt();
		System.out.println("Enter 3rd Num:");
		int c = sc.nextInt();
		if(a > b){
			if(a > c){
				System.out.println(a+ " is max");
			}else{
				System.out.println(c + " is max");
			}
		}else if(b > c){
		System.out.println(b+" is max");
	}else{
		System.out.println(c + " is max");
		}
	}
}
