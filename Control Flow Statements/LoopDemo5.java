import java.util.*;
class LoopDemo5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		System.out.println("Numbers from: "+a+ " to  "+ b);
		if(a<b){
		for(int i=a; i<=b; i++){
			System.out.println(i);
			}
			}else{
				for(int i=a; i>=b; i--){
			System.out.println(i);
			}
		}
	}
}
