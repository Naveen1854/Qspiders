import java.util.Scanner;
class  MaximumOf4
{
	public static void main(String[] args) 
	{
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Four Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a > b){
		num1 = a;
		}else{
			num1 = b;
		}
		if(c > d){
			num2 = c;
		}else{
			num2 = d;
		}
		if(num1 > num2){
			System.out.println(num1);
		}else{
			System.out.println(num2);
		}
	}
}
