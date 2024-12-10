package dsa;
import java.io.*;

public class LinearSearch {
	public static int search(int arr[], int n , int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x) 
				return i;
			}
			return -1;
	}

	public static void main(String[] args) {
		int arr[] = {2,3,4,10,40};
		int x=10;
		int n=arr.length;
//		function call
		int result = search(arr,n,x);
		if(result == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at index: " + result );
	}			
				
}
