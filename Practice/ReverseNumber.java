//Reverse of a Number:

import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		 int rev=0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();
		while(num != 0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/ 10;
	}
	System.out.println("The Reverse of given Number is : " + rev);
	}
}

 