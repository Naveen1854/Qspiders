package arrays;

public class SwapOddIndexEle {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 10, 7, 8, 9};
		 System.out.println("Original Array:");
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
		}
		 System.out.println();
		for(int i=0;i<arr.length;i++) {
		 
			if(i%2 != 0 && i+2 < arr.length) {
				int temp = arr[i];
				arr[i]=arr[i+2];
				arr[i+2]=temp;
				i=i+2;
			}
		}
		 System.out.println("Array after swapping odd indices:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}