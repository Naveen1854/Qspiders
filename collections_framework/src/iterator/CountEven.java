package iterator;
import java.util.*;

public class CountEven {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2, 5, 6, 9, 10, 12));
		Iterator<Integer> i = al.iterator();
		int count = 0;
		while(i.hasNext()) {
			int res = i.next();
			if(res % 2 == 0) {
				count=count+1;	
			}	
		}
		System.out.println("The count of Even Numbers: " + count);
	}
}