package arrays;

//copying one array elements to another array
public class ArrayDemo {
	public static void main(String args[]) {
		int arr [] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Length of array: " + arr.length);
		
		int res [] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i] = arr[i];
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
