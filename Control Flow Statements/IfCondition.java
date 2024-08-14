import java.util.*;
class  IfElseCondition{
	public static void main(String[] args) {
		System.out.println("Enter your Age:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 18){
		System.out.println("Welcome  to Vote!");
	}else{
		System.out.println("You are not Eligible to Vote!...");
		}
	}
}