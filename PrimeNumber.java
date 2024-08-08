import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		if(isprime(num)){
			System.out.println(num + " Prime Number");
		}else{
			System.out.println(num + " Not Prime Number");
		}
	}
	public static boolean isprime(int num){
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				return false;
				}
			}
			return true;
		}
}
