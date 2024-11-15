package iterator;
import java.util.*;

public class PrintEleIterator {
	public static void main(String[] args) {
		ArrayList <Object> al = new ArrayList<Object>();
//		al.add(5);
//		al.add(10);
//		al.add(15);
//		al.add(20);
//		al.add(25);
//		al.add(30);
		
		al.addAll(Arrays.asList(5,10,15,20,25,30,35,40));
		System.out.println(al);
		
//		use iterator to print the numbers:
		Iterator<Object> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
