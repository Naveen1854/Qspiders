package iterator;
import java.util.*;

public class RemoveElements {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5,15,3,20,9,25));
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()) {
			int res = i.next();
			if(res > 10) {
				System.out.println(res);
			}
		}
	}
}
