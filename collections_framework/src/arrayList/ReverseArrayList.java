package arrayList;
import java.util.*;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> reverse = new ArrayList<>();
		
		for(int i = al.size()-1; i >= 0; i--) {
			reverse.add(al.get(i));
		}
		System.out.println("reversed List: " + reverse);
	}
}
