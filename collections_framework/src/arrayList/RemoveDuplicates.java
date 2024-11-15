package arrayList;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2,4,6,8,2,3,5,3,4,5));
		System.out.println("List Before Removing Duplicates: " + al);
		
		//Use HashSet to remove Duplicates
		HashSet<Integer> unique = new HashSet<>(al); // Automatically Remove Duplicates
		al.clear(); //Clear the original list
		al.addAll(unique); // Add back only unique elements
		System.out.println("List After Removing Duplicates: "+ al);
	}
}
