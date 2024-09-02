import java.util.Scanner;
class PosNegNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num = sc.nextInt();
		//int num = 10;
		if(num >= 0){
			if(num > 0){
				System.out.println(num + " is Positive Number.");
			}else{
				System.out.println(num + " is Zero. ");
			}
		}else{
			System.out.println(num + " is Negative Number.");
		}
	}
}
