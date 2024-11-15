package dsa;

public class ReverseCharArray {
	public static void main(String[] args) {
		char ch [] = {'h','e','l','l','o'};
		System.out.println("Original Array: " + String.valueOf(ch));
		reverseString(ch);
		System.out.println("Reversed Array: " + String.valueOf(ch));
	}
	
	public static void reverseString(char[] s) {
		int left = 0;
		int right = s.length-1;
		while(left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;right--;
		}
	}
}
