package iterator;
import java.util.*;

public class EvenNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println(al);

		Iterator <Integer> i = al.iterator();
		while(i.hasNext()) {
			int even = i.next();
			if(even % 2 == 0) {
				System.out.println(even);
			}
		}		
	}
}
