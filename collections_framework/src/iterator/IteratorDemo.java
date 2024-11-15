package iterator;
import java.util.*;
public class IteratorDemo {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(54);
		al.add(19);
		al.add(18);
		al.add(11);
		al.add(24);
		System.out.println(al);
		Iterator <Integer> i = al.iterator();  // next() and hasNext() are pre-defined methods in iterator interface.

		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
//		System.out.println(i.next()); 
		
//		here we got NoSuchElementException. 
//		here hext() method will fetch the element even if there is no element found.
//		to over come this problem here we use both methods combiningly.
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
