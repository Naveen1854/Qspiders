package arrays;

public class Imatrix {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=2;i>=0;i--) {
			for(int j=2;j>=0;j--) {
				if(i==j)
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
