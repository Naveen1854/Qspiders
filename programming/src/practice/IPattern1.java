package practice;

public class IPattern1 {
	public static void main(String[] args) {
		//right angled triangle
		int num = 5;
//		for(int i = 1;i<=num;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//reversed right angled triangle
//		for(int i = 1;i<=num;i++) {
//			for(int j=i;j<=num;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		for(int i =1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i>=2 && i<=4 && j>=2 && j<=4) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}