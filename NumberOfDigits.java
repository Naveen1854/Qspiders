import java.util.Scanner;
class  NumberOfDigits
{
	public static void main(String[] args) 
	{
		int num = 0, a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		num = sc.nextInt();
		if(num < 0){
			num = num * -1;
	}else if(num == 0){
		num =1;
	}
	while(num > 0){
		num = num / 10;
		a++;
		}
		System.out.println("Number of digits in given number is: "+a);
	}
}
