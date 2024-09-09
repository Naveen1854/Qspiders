package Practice;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder reverse = new StringBuilder(str).reverse();
		System.out.println(reverse);
	}
}
