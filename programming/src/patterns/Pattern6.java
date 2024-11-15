package patterns;

public class Pattern6 {
	public static void main(String[] args) {
		int num = 3;
		for(int i = 1;i<2*num;i++) {
			for(int j=1;j<2*num;j++) {
				if(i<=j && i+j<=2*num || i+j>=2*num && i>=j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
