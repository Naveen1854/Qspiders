package iterator;
import java.util.*;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5, 10, 5, 15, 5, 20));
        System.out.println("Original List: " + al);

        ListIterator<Integer> i = al.listIterator(); //iterator doesn't contain set method 
        while(i.hasNext()) {						 // use listIterator() method
            int res = i.next();
            if(res == 5) {
                i.set(50);  // Replace 5 with 50
            }
        }

        System.out.println("List after replacing 5 with 50: " + al);
    }
}
