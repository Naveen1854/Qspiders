package arrays;

public class PrimeNumInArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			int numbers = arr[i];
//			System.out.print(numbers +" ");
			if(isPrime(numbers)) {
				System.out.println(numbers);
			}
		}
	}
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
