package Practice;

public class PrimeNumbers {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (isPrimes(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrimes(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}