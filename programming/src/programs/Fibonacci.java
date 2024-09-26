package programs;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range");
		int range=sc.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=range;i++) {
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
			sc.close();
		}
		

	}

}
