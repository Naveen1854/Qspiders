package practice;

public class EvenOdd {
	public static void evenodd(int start,int end) {
		System.out.println("Even Numbers: ");
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}System.out.println();
		System.out.println("Odd Numbers: ");
		for(int i=start;i<=end;i++) {
			if(i%2 != 0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		evenodd(2,10);
	}
}
