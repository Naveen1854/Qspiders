package iterator;
import java.util.*;

public class RemStringContChar {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(Arrays.asList("Tree", "Leaf", "Plant", "Flower", "Stem"));
		Iterator<String> i1 = al.iterator();
		while(i1.hasNext()) {
			String res = i1.next();
			if(res.contains("a")) { // removing the strings containing the character 'e'
				i1.remove();
			}
		}
		System.out.println(al);
	}
}
