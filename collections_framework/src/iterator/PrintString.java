package iterator;
import java.util.*;

public class PrintString {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot"));
		System.out.println(al);
		Iterator <String> i = al.iterator();
		while(i.hasNext()) {
			String res = i.next();
			if(res.charAt(0) == 'A') {
				System.out.println(res);
			}
		}
	}
}
