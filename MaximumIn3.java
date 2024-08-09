import java.util.Scanner;
class  MaximumIn3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println(a + " is max");
		}else if(b>c && b>a){
			System.out.println(b + " is max");
		}else{
			System.out.println(c + " is max");
		}
	}
}
