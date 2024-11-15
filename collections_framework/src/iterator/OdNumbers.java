package iterator;
import java.util.*;

public class OdNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9));
//		al.addAll(Arrays.asList(2,3,4,5,6,7,8,9));
		System.out.println(al);
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()) {
			int odd = i.next();
			if(odd % 2 != 0) {
			System.out.println(odd);
			}
		}
	}
}

