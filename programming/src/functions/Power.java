package functions;

public class Power {
	public static int power(int base, int exp) {
		int res = 1;
		for(int i=1;i<exp;i++) {
			res = res*base;
		}
		return res;
	}
	public static void main(String[] args) {
	int ans = power(2,4);
	System.out.println(ans);
	}
}
